package cn.itheima.service.impl;

import cn.itheima.dao.ProvinceDao;
import cn.itheima.dao.impl.ProvinceDaoImpl;
import cn.itheima.domain.Province;
import cn.itheima.jedis.util.JedisPoolUtils;
import cn.itheima.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService{
    private ProvinceDao dao =new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {

        //获得连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        //判断缓存中是否存在
        if (province_json == null || province_json.length() == 0) {
            //缓存中没有,近数据库
            System.out.println("redis中没有数据,查询数据库");
            //存入缓存
            List<Province> ps = dao.findAll();

            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            jedis.set("province", province_json);
            jedis.close();
        } else {
            //缓存中有
            System.out.println("redis中有数据,查询缓存...");
        }
        return province_json;
    }

}

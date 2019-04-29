package cn.itheima.service.impl;

import cn.itheima.dao.ProvinceDao;
import cn.itheima.dao.impl.ProvinceDaoImpl;
import cn.itheima.domain.Province;
import cn.itheima.jedis.utils.JedisPoolUtils;
import cn.itheima.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService{
    private ProvinceDao dao=new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {

        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        if (province_json==null||province_json.length()==0){
            System.out.println("缓存没有,进入数据库");
            List<Province> ps = dao.findAll();

            ObjectMapper mapper = new ObjectMapper();
            try {
               province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            jedis.set("province",province_json);
            jedis.close();


        }else{
            System.out.println("进入缓存");

        }



        return province_json;
    }
}

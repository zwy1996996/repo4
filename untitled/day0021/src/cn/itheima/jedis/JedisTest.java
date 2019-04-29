package cn.itheima.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {
    @Test
    public void test01(){
        Jedis jedis = new Jedis();
        jedis.set("xx","xxx");
        String xx = jedis.get("xx");
        System.out.println(xx);
        jedis.setex("ll",20,"lll");
        jedis.close();
    }
    @Test
    public void test02(){
        Jedis jedis = new Jedis();

    }
}

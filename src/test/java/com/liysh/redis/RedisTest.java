package com.liysh.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        //String
        redisTemplate.opsForValue().set("str","lisi");
        System.out.println("str="+redisTemplate.opsForValue().get("str"));
        /**
        //hash
        redisTemplate.boundHashOps("h_key").put("name","liysh");
        redisTemplate.boundHashOps("h_key").put("age",13);
        //获取所有域
        Set set=redisTemplate.boundHashOps("h_key").keys();
        System.out.println("hash散列的所有域："+set);
        //获取所有值
        List list=redisTemplate.boundHashOps("h_key").values();
        System.out.println("hash散列的所有域的值:"+list);
        //list
        redisTemplate.boundListOps("l_key").leftPush("c");
        redisTemplate.boundListOps("l_key").leftPush("b");
        redisTemplate.boundListOps("l_key").leftPush("a");
        //获取全部元素
        list=redisTemplate.boundListOps("l_key").range(0,-1);
        System.out.println("list中的所有元素:"+list);
        //set
        redisTemplate.boundSetOps("s_key").add("a","b","c");
        set=redisTemplate.boundSetOps("s_key").members();
        System.out.println("set集合中的所有元素:"+set);
        //sorted set
        redisTemplate.boundZSetOps("z_key").add("a",30);
        redisTemplate.boundZSetOps("z_key").add("b",20);
        redisTemplate.boundZSetOps("z_key").add("c",10);
        set=redisTemplate.boundZSetOps("z_key").range(0,-1);
        System.out.println("zset有序集合中的所有元素："+set);
         */
    }
}

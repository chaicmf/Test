package com.cmf.redis;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
public class RedisTemplateUtils {

    @Resource
    protected RedisTemplate<String,Object> redisTemplate;

    /**
     * 对String数据结构进行操作
     * @param key
     * @param value
     */
    public  void  set(String key,Object value){
        System.out.println("插入值key："+key+"\nvalue:"+value);
        redisTemplate.opsForValue().set(key,value);
    }

    public void  get(String key){
        Object o = redisTemplate.opsForValue().get(key);
        System.out.println("获取值key："+key+"\nvalue:"+o);

    }
    public  void delete(String key){
        redisTemplate.delete(key);

    }

    /**
     * 对String数据结构进行操作 并设置到期时间
     * @param key
     * @param Value
     * @param time
     * @param unit
     */
    public  void setByTimes(String key, Object Value, long time, TimeUnit unit){
        //例如  redisTemplate.opsForValue().set("name","zhang",10,TimeUnit.SECONDS);
        System.out.println("存放值  key:"+key+"\nvalue:"+Value+"\ntime:"+time+"\n时间类型:"+unit);
        redisTemplate.opsForValue().set(key,Value,time,unit);
    }

    /**
     * 失效时间过后，查询结果将为null  没有失效可以查询出来结果
     * @param key
     */
    public void getByTime(String key){
        Object o = redisTemplate.opsForValue().get(key);
        System.out.println("获取值key："+key+"\nvalue:"+o);
    }


}

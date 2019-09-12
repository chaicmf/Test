package com.cmf;

import com.cmf.redis.RedisTemplateUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.start();
        RedisTemplateUtils redisTemplateUtils=new RedisTemplateUtils();
        redisTemplateUtils.set("name","张");
        System.in.read();

    }
}

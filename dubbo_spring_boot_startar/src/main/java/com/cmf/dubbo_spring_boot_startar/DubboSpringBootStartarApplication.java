package com.cmf.dubbo_spring_boot_startar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class DubboSpringBootStartarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootStartarApplication.class, args);
        Demo cityService =  new Demo();
        cityService.query();
    }


}

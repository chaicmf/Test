package com.cmf.dubbozk;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDubboConfiguration
public class DubbozkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubbozkApplication.class, args);
    }

}

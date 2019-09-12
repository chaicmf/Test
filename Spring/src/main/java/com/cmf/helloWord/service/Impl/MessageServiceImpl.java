package com.cmf.helloWord.service.Impl;

import com.cmf.helloWord.service.MessageService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;


public class MessageServiceImpl implements MessageService {
    private  String username;
    private  int age;
    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String getMessage() {
        System.out.println("姓名："+username+"年龄："+age);
        return "hello World";
    }

    @Required
    public void setUsername(String username) {
        this.username=username;
    }
}

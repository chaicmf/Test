package com.cmf.dubbozk;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmf.service.DubboService;


public class DubboServ {
    @Reference
    private DubboService dubboService;

    public void  method(){
        dubboService.demo();
    }
}

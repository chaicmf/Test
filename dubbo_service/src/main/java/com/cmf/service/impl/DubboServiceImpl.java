package com.cmf.service.impl;

import com.cmf.service.DubboService;
import org.springframework.stereotype.Service;

@Service("dubboServiceImpl")
public class DubboServiceImpl implements DubboService {
    public void demo() {
        System.out.println("调用 dubbo——com.cmf.DubboService.DubboService");
    }
}

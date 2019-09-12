package com.cmf.dubbo_spring_boot_startar;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nx.salesAssistant.common.interfaces.IQueryClientInfoService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Reference(version = "1.0")
    private IQueryClientInfoService queryClientInfoServiceImpl;

    public  void query(){
        queryClientInfoServiceImpl.queryClientMsgForSwitch(null);
    }


    public static void main(String[] args) {
       new Demo().query();

        BeanFactoryb

                new ApplicationContext()
    }
}

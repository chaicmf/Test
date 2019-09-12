package com.cmf.helloWord;

import com.cmf.helloWord.service.Impl.MessageServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan //@comPontentScan 会自动扫描指定包下的全部包中有@Comointent的类并注册为bean
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
//         MessagePrinter printer=applicationContext.getBean(MessagePrinter.class);
//         printer.printMessage();
        ClassPathXmlApplicationContext applicationContext1=new ClassPathXmlApplicationContext("spring.xml");
        MessagePrinter messagePrinter= applicationContext1.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

    }
}

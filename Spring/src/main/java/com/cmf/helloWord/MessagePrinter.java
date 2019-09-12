package com.cmf.helloWord;

import com.cmf.helloWord.service.MessageService;
import org.springframework.stereotype.Component;

//@Component   //@Compontent的作用和@Service是一样的，都是为了声明这个类是Spring Bean
public class MessagePrinter {
    final private MessageService messageService;

    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }
    public  void printMessage(){
        System.out.println(this.messageService.getMessage());
    }
}

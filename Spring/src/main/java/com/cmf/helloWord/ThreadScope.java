package com.cmf.helloWord;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import sun.rmi.runtime.NewThreadAction;

import java.util.HashMap;
import java.util.Map;

public class ThreadScope implements Scope {
    private final ThreadLocal<HashMap<String,Object>>  threadLocal=new ThreadLocal <HashMap<String,Object>>(){
        @Override
        protected HashMap<String, Object> initialValue() {
            return new HashMap<String, Object>();
        }
    };

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        HashMap<String, Object> scope=threadLocal.get();
        Object  obj=scope.get(s);
        System.out.println("Get  "+s);
        if(null==obj){
            System.out.println("not  exits "+s);
            obj=objectFactory.getObject();
            scope.put(s,obj);
        }
        return obj;
    }

    @Override
    public Object remove(String s) {
        HashMap<String, Object> scope=threadLocal.get();
        System.out.println("remove"+s);
        return scope.remove(s);
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}

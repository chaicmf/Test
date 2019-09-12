package com.cmf.javaClass.innerClassTest;

public class ExtendInnerClassTest extends  innerClassTest {

    public static void main(String[] args) {

        new ExtendInnerClassTest();
    }
    public  void method(){
        System.out.println("ExtendInnerClassTest.methods()");
        super.methods();
    }

    //调用一个类的内部类         new ExtendInnerClassTest().new innerClass1();
}

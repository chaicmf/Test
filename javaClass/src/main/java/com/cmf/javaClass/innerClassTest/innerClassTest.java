package com.cmf.javaClass.innerClassTest;

/**
 * 定义一个普通的内部类
 * 在这种方式定义下，此时的内部类依赖外部类对象而存在
 * 即在创建一个普通内部类对象时许需要创建其外部类对象
 */
public class innerClassTest {
    //Java声明变量的时候没有写上修饰符为default
    String names="innerClassTest";
    private int inners=0;
    protected  boolean flags=true;
    public double  ds=0.00;
    public innerClassTest(){
        //通过getClass获取内部类的变量智能获取到public权限的变量
        System.out.println(innerClass1.class.getName()+"的变量长度"+innerClass1.class.getFields().length+":"+innerClass1.class.getFields()[0]);
        //通过这种方式可以获取全部变量
        innerClass1 innerClass1 =new innerClass1();

        System.out.println(innerClass1.class.getName()+"的变量为 "+innerClass1.d);
        System.out.println(innerClass1.getClass().getName()+"的变量为 "+innerClass1.inner);
        System.out.println(innerClass1.getClass().getName()+"的变量为 "+innerClass1.name);
        System.out.println(innerClass1.getClass().getName()+"的变量为 "+innerClass1.flag);
    }

    public  void methods(){
        System.out.println("innerClassTest.methods");
    }

    public static void main(String[] args) {
        System.out.println("innerClassTest    ");;
        innerClassTest innerClass1 = new innerClassTest();
    }

    //匿名内部类
    public  class innerClass1{
            //Java声明变量的时候没有写上修饰符为default
            String name="innerClass1";
            private int inner=1;
            protected  boolean flag=false;
            public double  d=1.00;
            public  innerClass1(){
                System.out.println("外部类的变量为  "+ds);
                System.out.println("外部类的变量为 "+inners);
                System.out.println("外部类的变量为 "+names);
                System.out.println("外部类的变量为  "+flags);
            }
            public void meth(){
                System.out.println("普通内部类的方法。。。。。。。。");

            }
    }
}

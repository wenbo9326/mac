package com.wen.demo3;

/**
 * @ClassName Demo3
 * @Description 方法的重载
 * @Author wenBo
 * @Date 2020/3/27 21:20
 */
public class Demo3 {
    public static void main(String[] args) {
        Hello h=new Hello();
        h.hello();
        h.hello("Melo");
        h.hello("Melo",35);

        String name="Carmelo anthony";
        //String类的重载方法
        System.out.println(name.length());
        System.out.println(name.indexOf(3));
        System.out.println(name.indexOf("m"));
        System.out.println(name.indexOf(1,5));
        System.out.println(name.indexOf("a",2));
    }
}
class Hello{
    /**
     * 这种方法名相同，但各自参数不同，成为方法的重载(overload)。
     * 注意：方法重载的返回值类型通常都是相同的
     */
    public void hello(){
        System.out.println("Hello World");
    }

    public void hello(String name){
        System.out.println("Hello,"+name);
    }

    public void hello(String name,int age){
        System.out.println("Hello,"+name+","+age);
    }
}

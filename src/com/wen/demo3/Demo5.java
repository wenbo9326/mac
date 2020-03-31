package com.wen.demo3;

/**
 * @ClassName Demo5
 * @Description 多态
 * @Author wenBo
 * @Date 2020/3/27 22:41
 */
public class Demo5 {
    public static void main(String[] args) {
        Person1 p=new Students();
        /*java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型
          这即是多态(Polymorphic)。多态是指，针对某个类型的方法调用，其真正执行的方法
          取决于运行时期实际类型的方法。-
         */
        p.run();
    }
}
class Person1{
    public void run(){
        System.out.println("Person run");
    }
}

class Students extends Person1{
    /**
      * @Description: 在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，
      * 被称为覆写（override）。方法签名包括方法名和方法参数。
      * @Param:
      * @return:
      */
    @Override
    public void run() {
        System.out.println("Students run");
    }
}

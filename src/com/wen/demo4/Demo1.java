package com.wen.demo4;

/**
 * @ClassName Demo1
 * @Description 抽象类
 * @Author wenBo
 * @Date 2020/3/28 15:33
 */
public class Demo1 {
    public static void main(String[] args) {
        Person p=new Student();
        /*这种尽量引用高层类型，避免引用实际子类型的方式
          称之为面向抽象编程。
         */
        p.run();
    }
}

/**
  * @Description: 如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是为了让子类
  * 去覆写它，那么，可以把父类的方法声明为抽象方法。
  * @Param: No such property: code for class: Script1
  * @return:
  */
abstract class Person{
    /**这个类由于被abstract修饰，所以本身是不能被实例化*/
    public abstract void run();
}

class Student extends Person{

    /**
     * @@Description: 由于继承了Person类，所以必须实现其抽象方法
     * @author: wenbo
     * @date: 2020/3/28 15:39
     * @param
     * @return: void
     */
    @Override
    public void run() {
        System.out.println("Student run");
    }
}

package com.wen.demo3;

/**
 * @ClassName Demo4
 * @Description 继承
 * @Author wenBo
 * @Date 2020/3/27 21:36
 */
public class Demo4 {
    public static void main(String[] args) {
        //这种把一个子类类型安全的变为父类类型的赋值，称为向上转型。
        Person p=new Student();
        //为了实现向下转型，Java提供了instanceof 操作符
        Person p1=new Person();
        System.out.println(p1 instanceof Person);
        System.out.println(p1 instanceof Student);

        Student s=new Student();
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
    }
}
/**
 * @@Description: 继承是面向对象编程中非常强大的一种机制，它首先可以服用代码。
 * @author: wenbo
 * @date: 2020/3/27 21:38
 */
class Student extends Person{
    /**
     * 在Java中，没有明确写extends的类，编译器会自动加上extends Object。
     * 所以，任何类，除了Object类，都会继承自某个类。而且，Java是单继承，一个类只能有一个父类。
     */
    private int score;

    public Student(String name, int age) {
        /*调用父类父类的构造方法，如果父类没有默认的构造方法，子类就必须显式调用super()
          并给出参数以便让编译器定位到父类的一个合适的构造方法。
         */
        super(name, age);
        this.score=score;
    }

    public Student() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String hello(){
        return "Hello,"+name;
    }
}

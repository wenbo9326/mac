package com.wen.demo3;


import org.jetbrains.annotations.NotNull;

/**
 * @ClassName Demo2
 * @Description 类和实例
 * @Author wenBo
 * @Date 2020/3/27 20:31
 */
public class Demo2 {
    public static void main(String[] args) {
        Person p=new Person("Carmelo",35);
        System.out.println(p);
        Book b=new Book();
        b.setName("三国演义");
        b.setAuthor("罗贯中");
        b.setPrice(99.88);
        System.out.println(b);
        b.m1("战争与和平","列夫.托尔斯泰",88.58);
    }
}
class Person{
    /**一个类可以包含多个字段(field)，字段用来描述一个类的特征。
      通过class，把一组数据汇集到一个对象上，实现了数据封装。
      其中，public是用来修饰字段的，它表示这个字段可以被外部访问。
     */
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    @NotNull
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @NotNull
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Book{
    public String name;
    public String author;
    public double price;
    //定义了class，只是定义了对象模板，而要根据对象模型创建出真正的对象实例。


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void m1(String name, String author, double price){
        System.out.println("书名为："+name+",作者是："+author+",价格为："+price);
    }
}

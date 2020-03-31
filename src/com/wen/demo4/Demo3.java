package com.wen.demo4; /**
 * @ClassName Demo3
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/28 16:29
 */

/**
 *@ClassName Demo3
 *@Description 静态变量和静态方法
 *@Author wenBo
 *@Date 2020/3/28 16:29
 */
public class Demo3 {
    public static void main(String[] args) {
        Book b=new Book("水浒传",99.99);
        Book.author="施耐庵";
        System.out.println(Book.author);
        Book.sale("钢铁是怎样炼成的");
    }
}

class Book{
    public String name;
    public double price;
    public static String author;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @Description: 静态方法常用于工具类和辅助方法
     * @author: wenbo
     * @date: 2020/3/28 23:55
     * @param name
     * @return: void
     */
    public static void sale(String name){
        System.out.println("这本书的书名为:"+name);
    }
}

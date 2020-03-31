package com.wen.demo3;

/**
 * @ClassName Demo1
 * @Description 面向对象编程
 * @Author wenBo
 * @Date 2020/3/27 15:31
 */
public class Demo1 {
    public static void main(String[] args) {
        GirlFriend girlFriend=new GirlFriend();
        girlFriend.name="Alice";
        girlFriend.send("rose");
    }
}
class GirlFriend{
    String name;
    void send(String str){
        System.out.println("送给"+name+"的花是："+str);
    }
}

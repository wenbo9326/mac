package com.wen.demo5;

/**
 * @ClassName FieldTest
 * @Description 访问字段的方法
 * @Author wenBo
 * @Date 2020/3/30 1:30
 */
public class FieldTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Class cla=Student.class;
        //获取public字段
        System.out.println(cla.getField("score"));
        //获取继承来的name字段
        System.out.println(cla.getField("name"));
        //获取private的字段"grade"
        System.out.println(cla.getDeclaredField("grade"));

    }
}
class Person{
    public String name;
}
class Student extends Person{
    public int score;
    private int grade;
}

package com.wen.demo5;

/**
 * @ClassName MethodTest
 * @Description 调用方法
 * @Author wenBo
 * @Date 2020/3/30 2:05
 */
public class MethodTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Class cla=Students.class;
        //获取public方法
        System.out.println(cla.getMethod("getScore",String.class));
        //获取继承的方法
        System.out.println(cla.getMethod("getName"));
        //获取私有方法
        System.out.println(cla.getDeclaredMethod("getGrade", int.class));
    }
}
class Students extends Person2{
    public int getScore(String type){
        return 99;
    }
    private int getGrade(int year){
        return 1;
    }
}
class Person2{
    public String getName(){
        return "Person";
    }
}

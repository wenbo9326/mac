package com.wen.demo5;

/**
 * @ClassName ReflectTest
 * @Description 反射的应用
 * @Author wenBo
 * @Date 2020/3/30 1:19
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        /**通过Class实例获取 class信息的方法称为反射。获取一个class的实例的方式有三个：
         * 一：直接通过一个class的静态变量class获取
         * 二：若有一个实例变量，通过该实例的getClass()方法获取
         * 三：若知道一个class的完整类名，可以通过静态方法Class.forName()获取
         */
        Class cla=String.class;
        String s="Hello";
        Class cls=s.getClass();
        Class cas=Class.forName("java.lang.String");
        System.out.println(cla);
    }
}

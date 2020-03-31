package com.wen.string; /**
 * @ClassName EnumTest
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/29 14:25
 */

/**
 *@ClassName EnumTest
 *@Description 枚举类的作用和基本操作
 *@Author wenBo
 *@Date 2020/3/29 14:25
 */
public class EnumTest {
    public static void main(String[] args) {
        Weekday day=Weekday.SUN;
        if (day==Weekday.SAT || day==Weekday.SUN){
            System.out.println("work at home");
        }else {
            System.out.println("work at office");
        }
    }
}
enum Weekday{
    SUN,MON,TUE,WED,THU,FRI,SAT;
}

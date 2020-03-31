package com.wen.demo;



/**
 * @ClassName Demo4
 * @Description 流程控制语句
 * @Author wenBo
 * @Date 2020/3/25 23:30
 */
public class Demo4 {
    public static void main(String[] args) {
        //对于整数类型判断
        int score=90;
        if (score>=90){
            System.out.println("优秀");
        }else if (score>=60){
            System.out.println("及格了");
        }else {
            System.out.println("挂了！！！");
        }
        System.out.println("END");
        double x=1-9.0/10;
        //对于浮点类型的判断,正确的方法是利用差值小于某个临界值来判断;
        if (Math.abs(x-0.1)<0.00001){
            System.out.println("x is 0.1");
        }else {
            System.out.println("x is not 0.1");
        }
        //判断引用类型相等
        String s1="Melo";
        String s2="Melo";
        if (s1.equals(s2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

}

package com.wen.demo;

import java.util.Scanner;

/**
 * @ClassName Demo3
 * @Description 输入和输出，以及格式化输出
 * @Author wenBo
 * @Date 2020/3/25 23:05
 */
public class Demo3 {
    public static void main(String[] args) {
        //不换行输出
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C,");
        System.out.print("D,");
        //换行输出
        System.out.println("Melo");
        System.out.println("格式化输出");
        double d=3.1415926;
        System.out.printf("%.2f\n",d);
        System.out.printf("%.4f\n",d);
        System.out.println("输入的演示:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your name:");
        String name=sc.next();
        System.out.println(name);
    }
}

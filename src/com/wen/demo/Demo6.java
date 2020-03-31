package com.wen.demo;

/**
 * @ClassName Demo6
 * @Description 循环语句的使用
 * @Author wenBo
 * @Date 2020/3/26 0:19
 */
public class Demo6 {
    public static void main(String[] args) {
        //while计算1-100的和
        //累加的和，初始化为0
        int sum=0;
        int n=1;
        while (n<=100){
            sum=sum+n;
            n++;
        }
        System.out.println(sum);
        //计算20到100的和
        int sum1=0;
        int a=20;
       while (a<=100){
           sum1=sum1+a;
           a++;
       }
        System.out.println(sum1);
        //使用do...while循环计算1-100的和
        int sum2=0;
        int b=1;
        do {
            sum2=sum2+b;
            b++;
        }while (b<=100);
        System.out.println(sum2);
    }

}


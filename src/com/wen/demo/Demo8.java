package com.wen.demo;

/**
 * @ClassName Demo8
 * @Description break和continue的使用
 * @Author wenBo
 * @Date 2020/3/26 1:03
 */
public class Demo8 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum=sum+i;
            //在循环过程中，可以使用break语句跳出当前循环
            if (i==5){
                break;
            }
        }
        System.out.println(sum);
        int sum1=0;
        for (int i=1;i<=10;i++){
            System.out.println("begin:"+i);
            if (i%2==0){
                continue;
            }
            sum1=sum1+i;
            System.out.println("end:"+i);
        }
        System.out.println(sum1);
    }
}

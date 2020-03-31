package com.wen.string;
/**
 *@ClassName StringBuilderTest
 *@Description 对字符串的操作--StringBuilder比StringBuffer速度快，但安全性比之较差。
 *@Author wenBo
 *@Date 2020/3/29 1:12
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String s="";
        for (int i=0;i<1000;i++){
            s=s+","+i;
        }
        System.out.println(s);
        //为了提高字符串的拼接效率，Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓存区
        StringBuilder sb=new StringBuilder(1024);
        for (int i=0;i<1000;i++){
            sb.append(',');
            sb.append(i);
        }
        String str=sb.toString();
        System.out.println(str);
        //StringBuilder还可以进行链式操作
        StringBuilder s1=new StringBuilder(1024);
        s1.append("Mr ")
                .append("Melo")
                .append("!!!")
                .insert(0,"Hello,");
        System.out.println(s1.toString());
    }
}

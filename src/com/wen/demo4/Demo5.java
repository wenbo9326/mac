package com.wen.demo4; /**
 * @ClassName Demo5
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/29 0:31
 */

/**
 *@ClassName Demo5
 *@Description 字符串和编码
 *@Author wenBo
 *@Date 2020/3/29 0:31
 */
public class Demo5 {
    public static void main(String[] args) {
        String str="Hello";
        String str1="Hello";
        System.out.println(str);
        System.out.println(str==str1);
        //两个字符串比较，必须总是使用equals()方法
        System.out.println(str.equals(str1));
        System.out.println(str.indexOf(1));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
        System.out.println(str.trim());
        System.out.println(str.split(","));
        System.out.println(String.valueOf(true));
        int i=Integer.parseInt("123");
        System.out.println(i);
        char[] c="Hello".toCharArray();
        String s=new String(c);
        System.out.println(s);
        c[0]='!';
        System.out.println(s);
    }
}

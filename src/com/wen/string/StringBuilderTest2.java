package com.wen.string; /**
 * @ClassName StringBuilderTest2
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/29 1:28
 */

import java.util.StringJoiner;

/**
 *@ClassName StringBuilderTest2
 *@Description 字符串的拼接
 *@Author wenBo
 *@Date 2020/3/29 1:28
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        String [] names={"Melo","Mcgrady","James"};
        //给StringJoiner制定开头和结尾
        StringJoiner str=new StringJoiner(", ","Hello,","!!!");
        for (String name:names){
            str.add(name);
        }
        System.out.println(str.toString());
    }
}

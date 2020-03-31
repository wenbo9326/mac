package com.wen.settest;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SetTest
 * @Description 对Set集合的基础测试
 * @Author wenBo
 * @Date 2020/3/31 12:33
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("xyz"));
        //Set集合是不允许存在重复值的，所以以下输出为false
        System.out.println(set.add("abc"));
        System.out.println(set.contains("XYZ"));
    }
}

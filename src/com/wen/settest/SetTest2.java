package com.wen.settest;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest2
 * @Description Set集合的遍历
 * @Author wenBo
 * @Date 2020/3/31 12:39
 */
public class SetTest2 {
    public static void main(String[] args) {
        //HashSet和SortedSet继承自Set，TreeSet继承自TreeSet，所以HashSet无序，TreeSet有序
        Set<String> set=new TreeSet<>();
        set.add("Melo");
        set.add("Paul");
        set.add("James");
        set.add("Lilade");
        for (String name:set){
            System.out.println(name);
        }

    }
}

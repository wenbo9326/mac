package com.wen.settest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName SortTest
 * @Description Collections工具类
 * @Author wenBo
 * @Date 2020/3/31 13:32
 */
public class SortTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Melo");
        list.add("Mcgrady");
        list.add("James");
        System.out.println(list);
        //将其变成不可变集合
        List<String> li=Collections.unmodifiableList(list);
        //会报UnsupportedOperationException异常。
        //li.add("Jordan");
        //排序后
        Collections.sort(list);
        System.out.println(list);
        //Collections提供了洗牌算法
        List<Integer> list1=new ArrayList<>();
        for (int i=0;i<10;i++){
            list1.add(i);
        }
        //洗牌前
        System.out.println(list1);
        Collections.shuffle(list1);
        //洗牌后
        System.out.println(list1);
    }
}

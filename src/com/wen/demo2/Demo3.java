package com.wen.demo2;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName Demo3
 * @Description 对数组进行降序排列第一种方法
 * @Author wenBo
 * @Date 2020/3/27 14:53
 */
public class Demo3 {
    public static void main(String[] args) {
        Integer [] arr={10,88,23,46,20,1,65};
        //主要是利用Collections.reverseOrder()方法
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i:arr){
            System.out.println(i);
        }
    }
}

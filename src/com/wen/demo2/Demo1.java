package com.wen.demo2;

import java.util.Arrays;

/**
 * @ClassName Demo1
 * @Description 数组的遍历
 * @Author wenBo
 * @Date 2020/3/27 14:05
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] a={10,20,35,66,80};
        /*对for循环的解释，
          初始条件为i=0,因为索引总是从0开始；
          继续循环的条件为i<a.length,因为i=a.length时，i已经超出了索引范围；
          每次循环后，i++。
         */
        for (int i=0;i<a.length;i++){
            int n=a[i];
            System.out.println(n);
        }
        System.out.println("-----------------------------------");
        //增强for循环的使用
        for (int i:a){
            System.out.println(i);
        }
        //直接利用Java标准库提供的Array.toString(),快速打印出数组元素
        System.out.print(Arrays.toString(a));
        //倒序打印出数组元素
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+",");
        }
    }
}

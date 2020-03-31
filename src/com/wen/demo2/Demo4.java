package com.wen.demo2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Demo4
 * @Description 对数组进行降序排列
 * @Author wenBo
 * @Date 2020/3/27 15:02
 */
public class Demo4 {
    public static void main(String[] args) {
        Integer[] arr = {10, 88, 23, 46, 20, 1, 65};
        Comparator cmp=new CMP();
        Arrays.sort(arr,cmp);
        for (int a:arr){
            System.out.println(a);
        }
    }
}
class CMP implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

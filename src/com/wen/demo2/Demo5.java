package com.wen.demo2;

import java.util.Arrays;

/**
 * @ClassName Demo5
 * @Description 多维数组
 * @Author wenBo
 * @Date 2020/3/27 15:08
 */
public class Demo5 {
    public static void main(String[] args) {
        int[][] arr={{1,3,46,33,40},{40,20,56,2,88,75}};
        for (int[] a:arr){
            for (int b:a){
                System.out.print(b);
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

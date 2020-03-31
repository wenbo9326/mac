package com.wen.demo2;

import java.util.Arrays;

/**
 * @ClassName Demo2
 * @Description 数组的排序
 * @Author wenBo
 * @Date 2020/3/27 14:26
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] a={20,45,10,48,80,9,66};
        //排序前
        System.out.println(Arrays.toString(a));
        /*冒泡排序的特点：
         每一轮循环后，最大的一个数被交换到末尾，因此，下一轮就可以“刨除”最后的数，
         每一轮循环都比上一轮循环的结束位置靠前一位。
         */
       /* for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    //交换a[j]和a[j+1]的位置
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        //排序后
        System.out.println(Arrays.toString(a));*/
        //利用Java标准库提供的方法进行排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

package com.wen.demo;

/**
 * @ClassName Demo2
 * @Description 字符串和数组
 * @Author wenBo
 * @Date 2020/3/25 22:24
 */
public class Demo2 {
    public static void main(String[] args) {
        //字符串的连接
        String str1="Hello";
        String str2="World";
        String str3=str1+""+str2+"!";
        System.out.println(str3);
        System.out.println("--------------------------------------------");
        //数组的初始化
        int[] score={90,88,75,69,80};
        System.out.println(score.length);
        score[3]=60;
        System.out.println(score[3]);
        //一维数组的遍历
        System.out.println("--------------------------------------------");
        for (int a:score){
            System.out.println(a);
        }
        //二维数组的遍历
        System.out.println("--------------------------------------------");
        int [][] age={{12,33,40,65},{10,25,30}};
        for (int[] b:age){
           for (int c:b){
               System.out.print(c+",");
           }
        }
        System.out.println("--------------------------------------------");
        System.out.print("二维数组的遍历结果为：");
        for (int i=0;i<age.length;i++){
            for (int j=0;j<age[i].length;j++){
                System.out.print(age[i][j]+",");
            }
        }
    }
}

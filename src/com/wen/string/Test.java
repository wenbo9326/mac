package com.wen.string; /**
 * @ClassName Test
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/29 14:34
 */

import java.util.Random;

/**
 *@ClassName Test
 *@Description 常用工具类的测试
 *@Author wenBo
 *@Date 2020/3/29 14:34
 */
public class Test {
    public static void main(String[] args) {
        //求绝对值
        System.out.println(Math.abs(-99));
        //求最大最小值
        System.out.println(Math.max(10,88));
        //计算次方
        System.out.println(Math.pow(2,4));
        //生成某个范围内的随机数
        double x=Math.random();
        double max=50;
        double min=10;
        double y=x*(max-min)+min;
        long n=(long)y;
        System.out.println(y);
        System.out.println(n);
        Random r=new Random(12345);
        for (int i=0;i<10;i++){
            System.out.println(r.nextInt(10));
        }
    }
}

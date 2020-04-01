package com.wen.junit;

/**
 * @ClassName Factorial
 * @Description 进行阶乘的运算
 * @Author wenBo
 * @Date 2020/4/1 0:03
 */
public class Factorial {
    public static long fact(long n){
        long r=1;
        for (int i=1;i<=n;i++){
            r=r*i;
        }
        return r;
    }
}

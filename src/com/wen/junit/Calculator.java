package com.wen.junit;

/**
 * @ClassName Calculator
 * @Description TODO
 * @Author wenBo
 * @Date 2020/4/1 1:36
 */
public class Calculator {
    private long n=0;

    public long add(long x){
        n=n+x;
        return n;
    }

    public long sub(long x){
        n=n-x;
        return n;
    }
}

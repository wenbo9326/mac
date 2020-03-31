package com.wen.string;

/**
 * @ClassName AssertionTest
 * @Description 断言的使用
 * @Author wenBo
 * @Date 2020/3/30 0:56
 */
public class AssertionTest {
    public static void main(String[] args) {
        double x=Math.abs(-123.45);
        assert x>=0;
        System.out.println(x);
    }

}

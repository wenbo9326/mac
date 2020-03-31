package com.wen.string;

/**
 *@ClassName ExceptionTest
 *@Description 异常的相关知识
 *@Author wenBo
 *@Date 2020/3/29 14:49
 */
public class ExceptionTest {
    public static void main(String[] args) {
        /**从继承关系来看，Throwable是异常体系的根，它继承自Object。Throwable有两个体系：
         * Error和Exception，Error表示严重的错误，程序一般对此无能为力。例如：
         * OutOfMemoryError  :内存耗尽。 NotClassDeFoundError : 无法加载某个类。
         * StackOverflowError : 栈溢出。
         * 而Exception则是运行时的异常，它可以被捕获或者处理。
         */
        byte[] b=toGBK("GBK");
        System.out.println(b);
    }
    static byte[] toGBK(String s){
        try {
            return s.getBytes("GBK");
        }catch (Exception e){
            System.out.println(e);
            return s.getBytes();
        }
    }
}

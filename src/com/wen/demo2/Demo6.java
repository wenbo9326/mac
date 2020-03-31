package com.wen.demo2;

import java.beans.beancontext.BeanContext;

/**
 * @ClassName Demo6
 * @Description 命令行参数
 * @Author wenBo
 * @Date 2020/3/27 15:22
 */
public class Demo6 {
    public static void main(String[] args) {
        for (String arg:args){
            if ("version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}

package com.wen.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FanXing
 * @Description 使用泛型
 * @Author wenBo
 * @Date 2020/3/30 14:13
 */
public class FanXing {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Melo");
        list.add("James");
        list.add("mcgrady");
        String str=list.get(0);
        System.out.println(str);
    }

}

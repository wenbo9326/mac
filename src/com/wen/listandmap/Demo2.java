package com.wen.listandmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Demo2
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/30 22:46
 */
public class Demo2 {
    public static void main(String[] args) {
        String key="a";
        Map<String,Integer> map=new HashMap<>();
        map.put(key,123);
        String key2= new String("a");
        map.get(key2);
        System.out.println(key==key2);
        System.out.println(key.equals(key2));

    }
}

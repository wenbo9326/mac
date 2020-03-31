package com.wen.listandmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Demo1
 * @Description 遍历Map
 * @Author wenBo
 * @Date 2020/3/30 21:23
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Melo",35);
        map.put("James",35);
        map.put("Mcgrady",38);
        map.put("Jordan",40);
        for (String key:map.keySet()){
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
        /**同时遍历出键和值*/
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}

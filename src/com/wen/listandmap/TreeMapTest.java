package com.wen.listandmap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TreeMapTest
 * @Description 有序的Map集合
 * @Author wenBo
 * @Date 2020/3/30 23:35
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        map.put("Melo",35);
        map.put("James",35);
        map.put("Mcgrady",40);
        for (String key:map.keySet()){
            //会按字母的顺序排序
            System.out.println(key);
        }
        //若是自定义的类，必须自定义一个排序算法
        Map<Person1,Integer> map1=new TreeMap<>(new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map1.put(new Person1("aaa"),1);
        map1.put(new Person1("zzz"),2);
        map1.put(new Person1("ccc"),1);
        for (Person1 key:map1.keySet()){
            System.out.println(key);
        }


    }
}
class Person1{
    public String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }
}

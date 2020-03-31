package com.wen.listandmap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TreeMapTest2
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/31 12:21
 */
public class TreeMapTest2 {
    public static void main(String[] args) {
        Map<Students,Integer> map=new TreeMap<>(new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                if (s1.score==s2.score){
                    return 0;
                }
                return s1.score>s2.score ? -1 : 1;
            }
        });
        map.put(new Students("Tom",77),1);
        map.put(new Students("Lily",88),2);
        map.put(new Students("Bob",66),3);
        for (Students key:map.keySet()){
            System.out.println(key);
        }
        System.out.println(map.get(new Students("Bob",66)));

    }
}
class Students{
    public String name;
    public int score;

    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

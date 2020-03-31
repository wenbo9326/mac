package com.wen.listandmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Main
 * @Description Map的应用
 * @Author wenBo
 * @Date 2020/3/30 21:01
 */
public class Main {
    public static void main(String[] args) {
        //用Map来查询某个学生的成绩
        Student stu=new Student("Melo",99);
        Map<String,Student> map=new HashMap<>();
        map.put("anthony",stu);
        Student target=map.get("anthony");
        System.out.println(target==stu);
        System.out.println(target.score);
        Student st=map.get("James");
        System.out.println(target==st);
        System.out.println(st);
    }
}
class Student{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

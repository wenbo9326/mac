package com.wen.listandmap;

import java.util.Objects;

/**
 * @ClassName EqualsTest
 * @Description equals方法的重写
 * @Author wenBo
 * @Date 2020/3/30 20:48
 */
public class EqualsTest {
    public static void main(String[] args) {

    }
}
class Person{
    public String name;
    public int age;

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Person){
            Person p= (Person) obj;
            //return this.name.equals(p.name)&&this.age==p.age;
            //为了简化引用类型，对以上方法作如下修改
            return Objects.equals(this.name,p.name) && this.age==p.age;
        }
        return false;
    }
}

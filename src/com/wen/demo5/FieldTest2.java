package com.wen.demo5;

import java.lang.reflect.Field;

/**
 * @ClassName FieldTest2
 * @Description 获取字段值
 * @Author wenBo
 * @Date 2020/3/30 1:46
 */
public class FieldTest2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object obj=new Person1("Melo");
        System.out.println();
        Class cls=obj.getClass();
        Field field=cls.getDeclaredField("name");
        field.setAccessible(true);
        Object value=field.get(obj);
        System.out.println(value);
    }
}
class Person1{
    private String name;

    public Person1(String name) {
        this.name = name;
    }
}
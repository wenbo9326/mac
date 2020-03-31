package com.wen.string; /**
 * @ClassName JavaBeanTest
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/29 14:16
 */

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 *@ClassName JavaBeanTest
 *@Description JavaBeanTest练习
 *@Author wenBo
 *@Date 2020/3/29 14:16
 */
public class JavaBeanTest {
    public static void main(String[] args) throws IntrospectionException {
        //要枚举一个JavaBean的所有属性，可以直接使用java核心库的Introspector
        BeanInfo info= Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd:info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" "+pd.getReadMethod());
            System.out.println(" "+pd.getWriteMethod());
        }

    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
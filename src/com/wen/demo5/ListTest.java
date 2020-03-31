package com.wen.demo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description List的相关操作
 * @Author wenBo
 * @Date 2020/3/30 15:54
 */
public class ListTest {
    public static void main(String[] args) {
        //List允许重复，并且可以添加null
        List<String> list=new ArrayList<>();
        list.add("Melo");
        list.add("James");
        list.add("Melo");
        list.add(null);
        System.out.println(list.size());
        //利用迭代器遍历集合
        for (Iterator<String> it=list.iterator();it.hasNext();){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("利用增强for循环遍历集合");
        for (String str:list){
            System.out.println(str);
        }

        List list1=List.of("Melo","Mcgrady","James","Jordan");
        /**把List变为Array有三种方法,
         * 第一种是调用toArray(）方法直接返回一个Object[]数组。
         * 第二种是给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中
         *
         */
        Object[] array=list1.toArray();
        for (Object s:array){
            System.out.println(s);
        }
    }
}

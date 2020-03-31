package com.wen.io;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateTest
 * @Description 时间和日历
 * @Author wenBo
 * @Date 2020/3/31 20:24
 */
public class DateTest {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getYear()+1900);
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        //转换为String
        System.out.println(date.toString());
        //转换为GMT时区
        System.out.println(date.toGMTString());
        //转换为本地时区
        System.out.println(date.toLocaleString());
        //以自定义格式输出时间
        Date d=new Date();
        var sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        var sdf1=new SimpleDateFormat("E MMM dd,yyyy");
        System.out.println(sdf.format(d));
        System.out.println(sdf1.format(d));
    }
}

package com.wen.io;

import java.util.Calendar;

/**
 * @ClassName CalenderTest
 * @Description 简单的日期和时间运算
 * @Author wenBo
 * @Date 2020/3/31 20:46
 */
public class CalenderTest {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=c.get(Calendar.MONTH);
        int d=c.get(Calendar.DAY_OF_MONTH);
        int w=c.get(Calendar.DAY_OF_WEEK);
        int hh=-c.get(Calendar.HOUR_OF_DAY);
        int mm=c.get(Calendar.MINUTE);
        int ss=c.get(Calendar.SECOND);
        int ms=c.get(Calendar.MILLISECOND);
        System.out.println(y+"-"+m+"-"+d+"-"+w+""+hh+":"+mm+":"+ss+":"+ms);
    }
}

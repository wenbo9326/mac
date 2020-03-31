package com.wen.io;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName LocalDateTimeTest
 * @Description jdk8以后新的API
 * @Author wenBo
 * @Date 2020/3/31 20:58
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        LocalDate d=dt.toLocalDate();
        LocalTime t=dt.toLocalTime();
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
        //自定义格式化时间
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        LocalDateTime dt2=LocalDateTime.parse("2020/03/31 21:10:20",dtf);
        System.out.println(dt2);
    }
}

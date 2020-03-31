package com.wen.listandmap;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/30 23:08
 */
public class EnumTest {
    public static void main(String[] args) {
        Map<DayOfWeek,String > map= new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY,"星期一");
        map.put(DayOfWeek.TUESDAY,"星期二");
        map.put(DayOfWeek.WEDNESDAY,"星期三");
        map.put(DayOfWeek.THURSDAY,"星期四");
        map.put(DayOfWeek.FRIDAY,"星期五");
        map.put(DayOfWeek.SATURDAY,"星期六");
        map.put(DayOfWeek.SUNDAY,"星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }
}

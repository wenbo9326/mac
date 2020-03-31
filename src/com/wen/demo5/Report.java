package com.wen.demo5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author wenbo
 */
//自定义一个注解
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value()default "";

}

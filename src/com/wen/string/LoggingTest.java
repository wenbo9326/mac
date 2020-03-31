package com.wen.string;

import java.util.logging.Logger;

/**
 * @ClassName LoggingTest
 * @Description 日志的使用
 * @Author wenBo
 * @Date 2020/3/30 1:01
 */
public class LoggingTest {
    public static void main(String[] args) {
        Logger log=Logger.getGlobal();
        log.info("start process...");
        log.warning("memory is running out...");
        log.fine("ignored.");
        log.severe("process will be terminated...");
    }
}

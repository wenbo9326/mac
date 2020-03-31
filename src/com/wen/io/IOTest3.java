package com.wen.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @ClassName IOTest3
 * @Description Path对象
 * @Author wenBo
 * @Date 2020/3/31 16:29
 */
public class IOTest3 {
    public static void main(String[] args) {
        Path p= Paths.get(".","project","study");
        System.out.println(p);
        //转换为绝对路径
        Path p2=p.toAbsolutePath();
        System.out.println(p2);
        //转换为规范路径
        Path p3=p2.normalize();
        System.out.println(p3);
        //转换为File对象
        File f=p3.toFile();
        System.out.println(f);
        for (Path p4:Paths.get("..").toAbsolutePath()){
            System.out.println(" "+p4);
        }

    }

}

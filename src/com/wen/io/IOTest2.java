package com.wen.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ClassName IOTest2
 * @Description 文件夹和文件的遍历
 * @Author wenBo
 * @Date 2020/3/31 15:48
 */
public class IOTest2 {
    public static void main(String[] args) {
        File file=new File("C:\\Windows");
        //列出所有文件和子目录
        File [] files=file.listFiles();
        printFiles(files);
        //仅列出.exe文件
        File[] files2=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //返回true表示接受该文件
                return name.endsWith(".exe");
            }
        });
        printFiles(files2);
    }

    static void printFiles(File [] files){
        System.out.println("============");
        if (files != null){
            for (File f:files){
                System.out.println(f);
            }
        }
        System.out.println("============");
    }
}

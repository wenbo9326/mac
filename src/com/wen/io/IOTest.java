package com.wen.io;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName IOTest
 * @Description IO流
 * @Author wenBo
 * @Date 2020/3/31 15:18
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        /**Input是从外部读入数据到内存，例如：从磁盘、网络到内存。
         * Output是把数据从内存输出到外部。例如：从内存到文件、网络。
         */
        //要构建一个File对象，必须传入文件路径。
        File f=new File("E:\\TestFile\\hello.txt");
        System.out.println(f);
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.length());
        File f1=new File("..");
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getCanonicalPath());
        System.out.println("----");
        File f2=new File("E:\\TestFile\\file");
        if (f2.createNewFile()){
            if (f2.delete()){
            }
        }
    }
}

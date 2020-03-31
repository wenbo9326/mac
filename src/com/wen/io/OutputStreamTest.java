package com.wen.io;

import java.io.*;

/**
 * @ClassName OutputStreamTest
 * @Description 输出流
 * @Author wenBo
 * @Date 2020/3/31 18:10
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException{
        try(OutputStream out=new FileOutputStream("src/readem.txt")) {
            out.write("Carmelo".getBytes("UTF-8"));
        }
        outputFile();
    }
    public static void outputFile() throws IOException{
        byte[] data;
        try(ByteArrayOutputStream output=new ByteArrayOutputStream()){
            output.write("Hello".getBytes("UTF-8"));
            output.write("World".getBytes("UTF-8"));
            data=output.toByteArray();
        }
        System.out.println(new String(data,"UTF-8"));
    }
}

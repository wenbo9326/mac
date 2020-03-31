package com.wen.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName InputStreamTest
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/31 17:40
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream对象
        InputStream in=null;
        try {
            in=new FileInputStream("src/readme.txt");
            int n;
            while ((n=in.read())!=-1){
                System.out.println(n);
            }
        }finally {
            if (in!=null){
                in.close();
            }
        }
    }
    public void readFile() throws IOException{
        try (InputStream in=new FileInputStream("src/readme.txt")){
            int n;
            while ((n=in.read())!=-1){
                System.out.println(n);
            }
        }
        //编译器会自动为我们写入finally并调用close
    }
    public void readBuffer() throws IOException{
        try(InputStream in=new FileInputStream("src/readme.txt")){
            byte[] bytes=new byte[1000];
            int n;
            while ((n=in.read(bytes))!=-1){
                System.out.println(n);
            }
        }
    }
}

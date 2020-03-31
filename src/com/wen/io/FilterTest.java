package com.wen.io;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName FilterTest
 * @Description 编写自己的FilterInputStream,以便叠加各种附加功能组件，称为装饰者模式
 * @Author wenBo
 * @Date 2020/3/31 18:31
 */
public class FilterTest {
    public static void main(String[] args) throws IOException{
        byte[] data="hello world!".getBytes("UTF-8");
        try(CountInputStream input=new CountInputStream(new ByteArrayInputStream(data))){
            int n;
            while ((n=input.read())!=-1){
                System.out.println((char)n);
            }
            System.out.println(input.getBytesRead());
        }
    }

}
class CountInputStream extends FilterInputStream{
    private int count=0;

    protected CountInputStream(InputStream in) {
        super(in);
    }

    public int getBytesRead(){
        return this.count;
    }

    @Override
    public int read() throws IOException{
        int n=in.read();
        if (n!=-1){
            this.count ++;
        }
        return n;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException{
        int n=in.read(b,off,len);
        this.count+=n;
        return n;
    }


}

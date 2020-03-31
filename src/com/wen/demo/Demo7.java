package com.wen.demo;

/**
 * @ClassName Demo7
 * @Description for循环的使用
 * @Author wenBo
 * @Date 2020/3/26 0:34
 */
public class Demo7 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        //对一个数组的元素求和
        int[] num={23,10,50,30};
        int sum1=0;
        for (int i=0;i<num.length;i++){
            System.out.println("i="+i+",num[i]="+num[i]);
            sum1=sum1+num[i];
        }
        System.out.println(sum1);
        for (int n:num){
            System.out.println(n);
        }
        System.out.println("--------------------------");
        //对数组进行倒序输出
        for (int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+",");
        }
        System.out.println();
        //使用for...each循环对数组每个元素求和
        int sum2=0;
        for (int c:num){
            sum2=sum2+c;
        }
        System.out.println(sum2);
    }
}

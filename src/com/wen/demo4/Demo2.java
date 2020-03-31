package com.wen.demo4;

/**
 * @ClassName Demo2
 * @Description 接口
 * @Author wenBo
 * @Date 2020/3/28 15:57
 */
public class Demo2 {
    public static void main(String[] args) {

    }
}
/**
 * @Description: 如果一个抽象类没有字段，所有方法都是抽象方法,那么就可以把抽象类改写为接口
 * @author: wenbo
 * @date: 2020/3/28 15:58
 */
interface Person1{
    /**所谓接口，就是比抽象类还抽象的纯抽象接口，因为
       因为它连字段都不能有。并且接口定义的所有方法默认都是
       public abatract的，所以不需要写出来。
     */
    void run();

    String getName();

}
/**
  * @Description: java属于单继承，但是一个类可以实现多个接口
  */
class Students implements Person1{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+"run");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

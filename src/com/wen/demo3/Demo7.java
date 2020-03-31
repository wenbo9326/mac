package com.wen.demo3;


/**
 * @ClassName Demo7
 * @Description
 * @Author wenBo
 * @Date 2020/3/28 13:46
 */
public class Demo7 {
    public static void main(String[] args) {

    }
}
class Person2{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String hello(){
        return "Hello,"+name;
    }
    /**
      * @Description: 如果一个父类不允许子类对它的某个方法进行覆写，
      * 可以把该方法标记为final。当然，此规则也同样适用于不想被继承的类和字段。
      * @Param:
      * @return:
      */
    public final String m(){
        return "Hello,"+name;
    }

    @Override
    public String toString() {
        return "Person:name="+name;
    }

    @Override
    public boolean equals(Object obj) {
        //当且仅当obj为Person类型
        if (obj instanceof Person2){
            Person2 p=(Person2)obj;
            //并且name字段相同时，返回true
            return this.name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

class Students1 extends Person2{
    @Override
    public String hello() {
        //调用父类的方法，要用super关键字
        return super.hello()+"!!!!! ";
    }
}

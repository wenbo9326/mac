package com.wen.demo4; /**
 * @ClassName Hello
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/28 23:59
 */

/**
 *@ClassName Hello
 *@Description 作用域
 *@Author wenBo
 *@Date 2020/3/28 23:59
 */
public class Hello {
    public static void main(String[] args) {
        Inner i=new Inner();
        i.hi();
    }
    /**在Java中，public、protected、private这些修饰符可以用来限定访问作用域*/
    public void hi(){
    }
    /**不能被其它类调用*/
    private static void hello(){
        System.out.println("Hello Melo");
    }
    /**由于Java支持嵌套类，所以嵌套类拥有访问 private 方法的权限*/
    static class Inner{
        public void hi(){
            Hello.hello();
        }
    }
    /**protected方法可以被继承的类访问*/
    protected void m(){
    }
}
class Main{
    void foo(){
        //上面的Hello类是由public修饰的，因此可以被其他包的类访问。
        Hello h=new Hello();
        //访问hi()方法的前提是先要能访问Hello类
        h.hi();
    }
}

class Test extends Hello{
    void foo(){
        Hello h=new Hello();
        h.hi();
    }
}

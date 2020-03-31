package com.wen.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyTest
 * @Description 动态代理
 * @Author wenBo
 * @Date 2020/3/30 2:50
 */
public class ProxyTest {
    public static void main(String[] args) {
        InvocationHandler handler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")){
                    System.out.println("Good morning, "+args[0]);
                }
                return null;
            }
        };
        Hello h= (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),new Class[]{Hello.class},handler);
        h.morning("Melo");
    }
}
interface Hello{
    void morning(String name);
}
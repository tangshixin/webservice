package com.example.webservice.other.proxy;

import org.omg.CORBA.portable.InvokeHandler;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Describe:
 * @ClassName: DynamicProxy
 * @Author: tsx
 * @Date: 2021/6/9 20:50
 **/
public class DynamicProxy implements InvocationHandler {

    private SayInterface sayInterface;

    public DynamicProxy(SayInterface sayInterface){
        this.sayInterface = sayInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开始执行动态代理方法");
        method.invoke(sayInterface,args);
        System.out.println("执行动态代理方法完毕");
        return null;
    }

    public static void main(String[] args) {
        SayInterface say = new Say();
        InvocationHandler handler = new DynamicProxy(say);
        SayInterface o = (SayInterface)Proxy.newProxyInstance(say.getClass().getClassLoader(), say.getClass().getInterfaces(), handler);
        o.sayHello();

    }


}

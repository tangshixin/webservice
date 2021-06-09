package com.example.webservice.other.proxy;

/**
 * @Describe:
 * @ClassName: Say
 * @Author: tsx
 * @Date: 2021/6/9 21:05
 **/
public class Say implements SayInterface {
    @Override
    public void sayHello() {
        System.out.println("调用say方法");
    }
}

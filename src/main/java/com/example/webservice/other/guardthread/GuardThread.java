package com.example.webservice.other.guardthread;

/**
 * @Describe: 守护线程例子
 *          特点：主线程不退出的话守护线程就一直存在，若主线程不存在的话，守护线程肯定不存在
 *          守护线程拥有自动结束自己生命周期的特点。非守护线程没有这个特点。
 *          实例：垃圾回收线程
 * @ClassName: GuardThread
 * @Author: tsx
 * @Date: 2021/6/8 20:43
 **/
public class GuardThread {

    public static void main(String[] args) {
        Thread thread = new BaseThread();
        thread.setName("基础线程");
        //启动之前设置为守护线程
        thread.setDaemon(true);
        thread.start();

        int i = 0;
        for (;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "------>" + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }


}

class BaseThread extends Thread{

    public void run(){
        int i = 10;
        while (true){
            System.out.println(Thread.currentThread().getName() + "------->" + (++i));
            try {
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}




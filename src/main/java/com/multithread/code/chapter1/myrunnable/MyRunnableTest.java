package com.multithread.code.chapter1.myrunnable;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class MyRunnableTest {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("main");
    }
}

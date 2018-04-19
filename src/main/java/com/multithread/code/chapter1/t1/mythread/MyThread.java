package com.multithread.code.chapter1.t1.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("Mythread");
    }
}

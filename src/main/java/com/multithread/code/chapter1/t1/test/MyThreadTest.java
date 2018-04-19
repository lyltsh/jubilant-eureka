package com.multithread.code.chapter1.t1.test;

import com.multithread.code.chapter1.t1.mythread.MyThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class MyThreadTest {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("run finish");
    }
}

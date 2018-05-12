package com.multithread.code.chapter3.test2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            Thread t1 = new Thread(new T2Thread1(lock));
            t1.start();
            Thread.sleep(1000);
            Thread t2 = new Thread(new T2Thread2(lock));
            t2.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

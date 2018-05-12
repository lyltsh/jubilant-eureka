package com.multithread.code.chapter3.test2.test2other;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            T2Thread1 t1 = new T2Thread1(lock);
            t1.start();
            Thread.sleep(1000);
            T2Thread2 t2 = new T2Thread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

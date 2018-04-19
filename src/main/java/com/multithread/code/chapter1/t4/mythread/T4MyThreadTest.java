package com.multithread.code.chapter1.t4.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class T4MyThreadTest {
    public static void main(String[] args) {
        T4MyThread myThread = new T4MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

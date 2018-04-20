package com.multithread.code.chapter1.sameNum.extthread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class ExtThreadTest {
    public static void main(String[] args) {
        ExtThread extThread = new ExtThread();
        Thread t1 = new Thread(extThread);
        Thread t2 = new Thread(extThread);
        Thread t3 = new Thread(extThread);
        Thread t4 = new Thread(extThread);
        Thread t5 = new Thread(extThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

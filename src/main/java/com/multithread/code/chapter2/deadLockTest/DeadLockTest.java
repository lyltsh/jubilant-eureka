package com.multithread.code.chapter2.deadLockTest;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/10
 */
public class DeadLockTest {
    public static void main(String[] args) {
        try {
            DeadLock deadLock = new DeadLock();

            deadLock.setFlag("a");
            Thread thread1 = new Thread(deadLock);
            thread1.start();

            Thread.sleep(100);

            deadLock.setFlag("b");
            Thread thread2 = new Thread(deadLock);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

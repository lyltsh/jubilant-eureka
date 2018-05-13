package com.multithread.code.chapter3.waitInterruptException;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class WaitInterruptTest {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            WaitInterruptThread a = new WaitInterruptThread(lock);
            a.start();

            Thread.sleep(5000);

            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
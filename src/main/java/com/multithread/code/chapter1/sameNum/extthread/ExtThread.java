package com.multithread.code.chapter1.sameNum.extthread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class ExtThread extends Thread {
    private int i = 5;

    @Override
    synchronized public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}

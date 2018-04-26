package com.multithread.code.chapter1.t17.T17Mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class T17Mythread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time " + (endTime - beginTime) + " ms");
    }
}

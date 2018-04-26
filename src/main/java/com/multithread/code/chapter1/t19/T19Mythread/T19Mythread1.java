package com.multithread.code.chapter1.t19.T19Mythread;

import java.util.Random;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class T19Mythread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thread 1 use time=" + (endTime - beginTime));
    }
}

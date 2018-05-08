package com.multithread.code.chapter2.t7.mytask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class MyTask {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName="
                    + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}

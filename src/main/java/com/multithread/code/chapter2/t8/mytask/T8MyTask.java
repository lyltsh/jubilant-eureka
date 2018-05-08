package com.multithread.code.chapter2.t8.mytask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T8MyTask {
     synchronized public void otherMethod() {
        System.out.println("------------------------run--otherMethod");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}

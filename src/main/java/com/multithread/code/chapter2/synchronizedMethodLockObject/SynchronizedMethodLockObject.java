package com.multithread.code.chapter2.synchronizedMethodLockObject;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/25
 */
public class SynchronizedMethodLockObject extends Thread {

     synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName="
                    + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

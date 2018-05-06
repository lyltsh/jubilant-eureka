package com.multithread.code.chapter2.synchronizedMethodLockObject2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/25
 */
public class SynchronizedMethodLockObject2 extends Thread {

    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName="
                    + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end，end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     public void methodB() {
        try {
            System.out.println("begin methodB threadName="
                    + Thread.currentThread().getName()
                    + " begin time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

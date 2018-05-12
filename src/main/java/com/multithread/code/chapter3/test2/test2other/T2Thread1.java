package com.multithread.code.chapter3.test2.test2other;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class T2Thread1 extends Thread {
    private Object lock;

    public T2Thread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("begin wait time: " + System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait time: " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

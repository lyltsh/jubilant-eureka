package com.multithread.code.chapter3.test2.test2other;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class T2Thread2 extends Thread {
    private Object lock;

    public T2Thread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("begin notify time: " + System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify time: "+ System.currentTimeMillis());
        }
    }
}

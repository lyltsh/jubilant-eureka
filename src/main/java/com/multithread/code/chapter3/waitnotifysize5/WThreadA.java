package com.multithread.code.chapter3.waitnotifysize5;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class WThreadA implements Runnable {
    private Object lock;

    public WThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {

                if (MyList.size() != 5) {
                    System.out.println("wait begin: " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("watt end: " + System.currentTimeMillis());
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

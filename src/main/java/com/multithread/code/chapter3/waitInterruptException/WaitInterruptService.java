package com.multithread.code.chapter3.waitInterruptException;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class WaitInterruptService {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("  end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("exception interrupted");
        }
    }
}

package com.multithread.code.chapter3.waitInterruptException;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class WaitInterruptThread extends Thread {
    private Object lock;

    public WaitInterruptThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        WaitInterruptService service = new WaitInterruptService();
        service.testMethod(lock);
    }
}

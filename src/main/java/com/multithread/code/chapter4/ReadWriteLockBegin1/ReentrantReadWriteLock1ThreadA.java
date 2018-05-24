package com.multithread.code.chapter4.ReadWriteLockBegin1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/24
 */
public class ReentrantReadWriteLock1ThreadA extends Thread {
    private ReentrantReadWriteLock1 service;

    public ReentrantReadWriteLock1ThreadA(ReentrantReadWriteLock1 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}

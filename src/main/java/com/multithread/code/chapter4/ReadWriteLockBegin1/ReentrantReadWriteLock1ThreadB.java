package com.multithread.code.chapter4.ReadWriteLockBegin1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/24
 */
public class ReentrantReadWriteLock1ThreadB extends Thread {
    private ReentrantReadWriteLock1 service;

    public ReentrantReadWriteLock1ThreadB(ReentrantReadWriteLock1 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}

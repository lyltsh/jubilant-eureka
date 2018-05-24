package com.multithread.code.chapter4.ReadWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/24
 */
public class ReentrantReadWriteLock1 {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName()
                        + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

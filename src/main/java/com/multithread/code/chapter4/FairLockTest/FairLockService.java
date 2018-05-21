package com.multithread.code.chapter4.FairLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/22
 */
public class FairLockService {
    private ReentrantLock lock;

    public FairLockService(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("thread name= "+Thread.currentThread().getName()+" lock");
        }finally {
            lock.unlock();
        }
    }
}

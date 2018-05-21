package com.multithread.code.chapter4.ReentrantLockTest.extthread;

import com.multithread.code.chapter4.ReentrantLockTest.ReentrantLockService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ReentrantLockThread extends Thread {
    private ReentrantLockService lockService;

    public ReentrantLockThread(ReentrantLockService lockService) {
        super();
        this.lockService = lockService;
    }

    @Override
    public void run() {
        lockService.testMethod();
    }
}

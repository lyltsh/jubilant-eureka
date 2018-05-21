package com.multithread.code.chapter4.ReentrantLockTest;

import com.multithread.code.chapter4.ReentrantLockTest.extthread.ReentrantLockThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ReentrantLockTest {
    public static void main(String[] args){
        ReentrantLockService lockService = new ReentrantLockService();
        ReentrantLockThread lockThreadA = new ReentrantLockThread(lockService);
        ReentrantLockThread lockThreadB = new ReentrantLockThread(lockService);
        ReentrantLockThread lockThreadC = new ReentrantLockThread(lockService);
        ReentrantLockThread lockThreadD = new ReentrantLockThread(lockService);

        lockThreadA.start();
        lockThreadB.start();
        lockThreadC.start();
        lockThreadD.start();
    }
}

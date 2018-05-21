package com.multithread.code.chapter4.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class UseConditionWaitNotifyErrorService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("lock");
            condition.await();
            System.out.println("wait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.multithread.code.chapter2.synchronizedMethodLockObject;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/25
 */
public class SynchronizedMethodLockObjectThreadA extends Thread {
    private SynchronizedMethodLockObject object;

    public SynchronizedMethodLockObjectThreadA(SynchronizedMethodLockObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}

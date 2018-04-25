package com.multithread.code.chapter2.synchronizedMethodLockObject2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/25
 */
public class SynchronizedMethodLockObjectThreadB2 extends Thread {
    private SynchronizedMethodLockObject2 object;

    public SynchronizedMethodLockObjectThreadB2(SynchronizedMethodLockObject2 object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}

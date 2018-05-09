package com.multithread.code.chapter2.synchronizedBlockLockAll.test1.service;

import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.extobject.MyObject;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class Test1Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 ____getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

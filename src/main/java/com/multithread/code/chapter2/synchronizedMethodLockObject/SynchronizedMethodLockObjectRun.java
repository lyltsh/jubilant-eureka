package com.multithread.code.chapter2.synchronizedMethodLockObject;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/25
 */
public class SynchronizedMethodLockObjectRun {
    public static void main(String[] args) {
        SynchronizedMethodLockObject myObject = new SynchronizedMethodLockObject();
        SynchronizedMethodLockObjectThreadA threadA = new SynchronizedMethodLockObjectThreadA(myObject);
        SynchronizedMethodLockObjectThreadB threadB = new SynchronizedMethodLockObjectThreadB(myObject);
        threadA.setName("threadA");
        threadB.setName("threadB");
        threadA.start();
        threadB.start();
    }
}

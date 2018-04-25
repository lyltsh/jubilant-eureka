package com.multithread.code.chapter2.synchronizedMethodLockObject2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/25
 */
public class SynchronizedMethodLockObjectRun2 {
    public static void main(String[] args) {
        SynchronizedMethodLockObject2 myObject = new SynchronizedMethodLockObject2();
        SynchronizedMethodLockObjectThreadA2 threadA = new SynchronizedMethodLockObjectThreadA2(myObject);
        SynchronizedMethodLockObjectThreadB2 threadB = new SynchronizedMethodLockObjectThreadB2(myObject);
        threadA.setName("threadA");
        threadB.setName("threadB");
        threadA.start();
        threadB.start();
    }
}

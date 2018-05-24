package com.multithread.code.chapter4.ReadWriteLockBegin1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/24
 */
public class ReentrantReadWriteLock1Test {
    public static void main(String[] args){
        ReentrantReadWriteLock1 lock1 = new ReentrantReadWriteLock1();
        ReentrantReadWriteLock1ThreadA threadA = new ReentrantReadWriteLock1ThreadA(lock1);
        ReentrantReadWriteLock1ThreadB threadB = new ReentrantReadWriteLock1ThreadB(lock1);
        threadA.start();
        threadB.start();
    }
}

package com.multithread.code.chapter1.suspendResumeDealLock;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class suspendResumeDealLock{
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("thread a suspend");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}

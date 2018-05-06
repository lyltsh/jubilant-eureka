package com.multithread.code.chapter2.synLockIn_1.test;

import com.multithread.code.chapter2.synLockIn_1.extthread.MyThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class SynLockIn1Test {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

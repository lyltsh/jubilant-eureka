package com.multithread.code.chapter2.synLockIn_2.test;

import com.multithread.code.chapter2.synLockIn_2.extthread.MyThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class SynLockIn2Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

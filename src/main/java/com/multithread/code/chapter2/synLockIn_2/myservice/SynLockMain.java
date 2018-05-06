package com.multithread.code.chapter2.synLockIn_2.myservice;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class SynLockMain {
    public int i = 10;

    synchronized void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

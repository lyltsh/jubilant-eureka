package com.multithread.code.chapter2.synLockIn_2.myservice;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class SynLockSub extends SynLockMain {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(1);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

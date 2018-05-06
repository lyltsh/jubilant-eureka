package com.multithread.code.chapter2.synLockIn_2.extthread;

import com.multithread.code.chapter2.synLockIn_2.myservice.SynLockSub;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class MyThread extends Thread {
    @Override

    public void run() {
        SynLockSub sub = new SynLockSub();
        sub.operateISubMethod();
    }
}

package com.multithread.code.chapter1.suspendResumeTest;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class suspendResume extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}

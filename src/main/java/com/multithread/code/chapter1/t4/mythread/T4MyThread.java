package com.multithread.code.chapter1.t4.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class T4MyThread extends Thread {
    public int count = 5;

    @Override
    public void run() {
        super.run();
        --count;
        System.out.println("run by" + this.currentThread().getName()
                + " , count= " + count);
    }
}

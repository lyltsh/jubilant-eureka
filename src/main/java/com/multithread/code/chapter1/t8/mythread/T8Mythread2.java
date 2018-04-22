package com.multithread.code.chapter1.t8.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/22
 */
public class T8Mythread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="
                    + this.currentThread().getName() + " begin ="
                    + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName="
                    + this.currentThread().getName() + " end   ="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

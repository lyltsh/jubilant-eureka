package com.multithread.code.chapter1.t8.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/22
 */
public class T8Mythread1 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName="
                    + this.currentThread().getName() + " begin");
            System.out.println(this.currentThread().getId());
            Thread.sleep(2000);
            System.out.println("run threadName="
                    + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

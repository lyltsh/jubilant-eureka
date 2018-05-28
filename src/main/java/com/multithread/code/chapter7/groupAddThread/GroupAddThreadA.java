package com.multithread.code.chapter7.groupAddThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class GroupAddThreadA extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

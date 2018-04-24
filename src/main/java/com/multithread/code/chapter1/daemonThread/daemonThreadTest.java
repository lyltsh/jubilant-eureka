package com.multithread.code.chapter1.daemonThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class daemonThreadTest {
    public static void main(String[] args) {
        try {
            daemonThread thread = new daemonThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("thread stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

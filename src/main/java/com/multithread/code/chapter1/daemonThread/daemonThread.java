package com.multithread.code.chapter1.daemonThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class daemonThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

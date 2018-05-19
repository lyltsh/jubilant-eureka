package com.multithread.code.chapter3.joinmoretest.extthread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class JoinSleepThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("  begin threadB threadName=" + Thread.currentThread().getName() +
                    " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end threadB threadName=" + Thread.currentThread().getName() +
                    " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

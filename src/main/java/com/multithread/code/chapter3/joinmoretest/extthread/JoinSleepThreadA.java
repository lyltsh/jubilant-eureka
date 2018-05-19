package com.multithread.code.chapter3.joinmoretest.extthread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class JoinSleepThreadA extends Thread {

    private JoinSleepThreadB threadB;

    public JoinSleepThreadA(JoinSleepThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB) {
                System.out.println("  begin threadA threadName=" + Thread.currentThread().getName() +
                        " " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end threadA threadName=" + Thread.currentThread().getName() +
                        " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

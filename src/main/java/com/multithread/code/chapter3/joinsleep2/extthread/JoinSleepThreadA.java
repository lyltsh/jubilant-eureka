package com.multithread.code.chapter3.joinsleep2.extthread;

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
            synchronized (threadB){
                threadB.start();
                //join方法释放锁
                threadB.join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

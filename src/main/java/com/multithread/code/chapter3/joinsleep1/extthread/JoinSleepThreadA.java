package com.multithread.code.chapter3.joinsleep1.extthread;

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
                //sleep方法不释放锁
                Thread.sleep(6000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

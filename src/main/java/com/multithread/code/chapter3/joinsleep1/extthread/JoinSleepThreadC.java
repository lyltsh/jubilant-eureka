package com.multithread.code.chapter3.joinsleep1.extthread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class JoinSleepThreadC extends Thread {
    private JoinSleepThreadB threadB;

    public JoinSleepThreadC(JoinSleepThreadB threadB) {
        super();
        this.threadB = threadB;
    }
    @Override
    public void run(){
        threadB.bService();
    }
}

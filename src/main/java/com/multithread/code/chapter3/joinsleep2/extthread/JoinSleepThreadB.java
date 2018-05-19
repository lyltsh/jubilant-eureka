package com.multithread.code.chapter3.joinsleep2.extthread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class JoinSleepThreadB extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("   threadB run begin timer="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   threadB run   end timer="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService(){
        System.out.println("print bService timer="+System.currentTimeMillis());
    }
}

package com.multithread.code.chapter7.stateTest3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class StateTest3ThreadA extends Thread {
    @Override
    public void run() {
        try {
            StateTest3Object.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

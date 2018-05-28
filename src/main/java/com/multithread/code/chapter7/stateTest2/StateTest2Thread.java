package com.multithread.code.chapter7.stateTest2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class StateTest2Thread extends Thread {

    public StateTest2Thread() {
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.multithread.code.chapter7.stateTest2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class StateTest2Test {
    // NEW,
    // RUNNABLE,
    // TERMINATED,

    // BLOCKED,
    // WAITING,
    // TIMED_WAITING,

    public static void main(String[] args) {
        try {
            StateTest2Thread t = new StateTest2Thread();
            System.out.println("main方法中的状态1：" + t.getState());
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2：" + t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

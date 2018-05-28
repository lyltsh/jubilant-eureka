package com.multithread.code.chapter7.stateTest3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class StateTest3Test {
    // NEW,
    // RUNNABLE,
    // TERMINATED,

    // BLOCKED,
    // WAITING,
    // TIMED_WAITING,

    public static void main(String[] args) {

        StateTest3ThreadA threadA = new StateTest3ThreadA();
        threadA.setName("threadA");
        threadA.start();

        StateTest3ThreadB threadB = new StateTest3ThreadB();
        threadB.setName("threadB");
        threadB.start();
        System.out.println(threadB.getName() + ", state: " + threadB.getState());
    }
}

package com.multithread.code.chapter7.stateTest1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class StateTest1Thread extends Thread {

    public StateTest1Thread() {
        //构造方法中的状态，其实是main方法中线程的状态：RUNNABLE
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态：" + Thread.currentThread().getState());
    }
}

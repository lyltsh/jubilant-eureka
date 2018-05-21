package com.multithread.code.chapter4.UseConditionWaitNotifyOK;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ThreadA extends Thread {
    private UseConditionWaitNotifyOKService service;

    public ThreadA(UseConditionWaitNotifyOKService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}

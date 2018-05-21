package com.multithread.code.chapter4.UseConditionWaitNotifyError;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ThreadA extends Thread {
    private UseConditionWaitNotifyErrorService service;
    public ThreadA(UseConditionWaitNotifyErrorService service){
        this.service = service;
    }
    @Override
    public void run(){
        service.await();
    }
}

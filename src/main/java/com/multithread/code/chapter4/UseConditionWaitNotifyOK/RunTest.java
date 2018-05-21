package com.multithread.code.chapter4.UseConditionWaitNotifyOK;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        UseConditionWaitNotifyOKService service = new UseConditionWaitNotifyOKService();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(3000);
        service.signal();
    }
}

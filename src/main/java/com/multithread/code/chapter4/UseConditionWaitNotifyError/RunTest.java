package com.multithread.code.chapter4.UseConditionWaitNotifyError;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class RunTest {
    public static void main(String[] args) {
        UseConditionWaitNotifyErrorService service = new UseConditionWaitNotifyErrorService();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
    }
}

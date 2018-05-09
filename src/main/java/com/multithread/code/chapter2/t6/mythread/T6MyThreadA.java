package com.multithread.code.chapter2.t6.mythread;

import com.multithread.code.chapter2.t6.commonutils.CommonUtils;
import com.multithread.code.chapter2.t6.mytask.T6MyTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T6MyThreadA extends Thread {
    private T6MyTask task;

    public T6MyThreadA(T6MyTask task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
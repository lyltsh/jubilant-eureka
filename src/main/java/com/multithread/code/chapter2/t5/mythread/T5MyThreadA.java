package com.multithread.code.chapter2.t5.mythread;

import com.multithread.code.chapter2.t5.commonutils.CommonUtils;
import com.multithread.code.chapter2.t5.mytask.T5MyTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T5MyThreadA extends Thread {
    private T5MyTask task;

    public T5MyThreadA(T5MyTask task) {
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
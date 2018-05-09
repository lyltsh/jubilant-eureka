package com.multithread.code.chapter2.t5.mythread;

import com.multithread.code.chapter2.t5.commonutils.CommonUtils;
import com.multithread.code.chapter2.t5.mytask.T5MyTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T5MyThreadB extends Thread {
    private T5MyTask task;

    public T5MyThreadB(T5MyTask task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}

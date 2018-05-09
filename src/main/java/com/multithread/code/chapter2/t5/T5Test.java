package com.multithread.code.chapter2.t5;

import com.multithread.code.chapter2.t5.commonutils.CommonUtils;
import com.multithread.code.chapter2.t5.mytask.T5MyTask;
import com.multithread.code.chapter2.t5.mythread.T5MyThreadA;
import com.multithread.code.chapter2.t5.mythread.T5MyThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T5Test {
    public static void main(String[] args) {
        T5MyTask task = new T5MyTask();

        T5MyThreadA threadA = new T5MyThreadA(task);
        threadA.start();
        T5MyThreadB threadB = new T5MyThreadB(task);
        threadB.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }

        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }

        System.out.println("耗时：" + ((endTime - beginTime) / 1000));
    }
}

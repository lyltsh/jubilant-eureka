package com.multithread.code.chapter2.t6;

import com.multithread.code.chapter2.t6.commonutils.CommonUtils;
import com.multithread.code.chapter2.t6.mytask.T6MyTask;
import com.multithread.code.chapter2.t6.mythread.T6MyThreadA;
import com.multithread.code.chapter2.t6.mythread.T6MyThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T6Test {
    public static void main(String[] args) {
        T6MyTask task = new T6MyTask();

        T6MyThreadA threadA = new T6MyThreadA(task);
        threadA.setName("threadA");
        threadA.start();
        T6MyThreadB threadB = new T6MyThreadB(task);
        threadB.setName("threadB");
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

package com.multithread.code.chapter5.timerTest2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class timerTest2Run4 {
    public static class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间为：" + new Date());
        /*
        schedule(TimerTask task, long delay, long period)
        在当前时间基础上delay一个时间段，再以某个period间隔无限次循环执行
         */
        timer.schedule(myTask, 3000, 5000);
    }
}

package com.multithread.code.chapter2.t5.mytask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T5MyTask {
    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间处理从远程返回的值1 threadName="
                    + Thread.currentThread().getName();
            getData2 = "长时间处理从远程返回的值2 threadName="
                    + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

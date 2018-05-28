package com.multithread.code.chapter7.stateTest3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class StateTest3Object {
    synchronized public static void method() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" run the method");
        Thread.sleep(10000);
    }
}

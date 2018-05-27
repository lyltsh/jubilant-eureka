package com.multithread.code.chapter6.singleton0;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton0Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleTon0Object.getInstance().hashCode());
    }
}

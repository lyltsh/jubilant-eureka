package com.multithread.code.chapter6.singleton3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton3Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleTon3Object.getInstance().hashCode());
    }
}

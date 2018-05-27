package com.multithread.code.chapter6.singleton1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton1Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleTon1Object.getInstance().hashCode());
    }
}

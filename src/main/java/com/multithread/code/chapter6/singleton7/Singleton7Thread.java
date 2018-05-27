package com.multithread.code.chapter6.singleton7;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton7Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleTon7Object.getInstance().hashCode());
    }
}

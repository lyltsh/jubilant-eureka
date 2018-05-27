package com.multithread.code.chapter6.singleton4;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton4Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleTon4Object.getInstance().hashCode());
    }
}

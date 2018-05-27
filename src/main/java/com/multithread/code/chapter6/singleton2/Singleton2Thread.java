package com.multithread.code.chapter6.singleton2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton2Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleTon2Object.getInstance().hashCode());
    }
}

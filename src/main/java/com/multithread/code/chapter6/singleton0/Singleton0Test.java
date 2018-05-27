package com.multithread.code.chapter6.singleton0;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton0Test {
    public static void main(String[] args) {
        Singleton0Thread thread1 = new Singleton0Thread();
        Singleton0Thread thread2 = new Singleton0Thread();
        Singleton0Thread thread3 = new Singleton0Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

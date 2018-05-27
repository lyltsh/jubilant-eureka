package com.multithread.code.chapter6.singleton7;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton7Test {
    public static void main(String[] args) {
        Singleton7Thread thread1 = new Singleton7Thread();
        Singleton7Thread thread2 = new Singleton7Thread();
        Singleton7Thread thread3 = new Singleton7Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

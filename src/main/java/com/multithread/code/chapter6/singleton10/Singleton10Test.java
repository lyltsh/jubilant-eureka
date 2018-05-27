package com.multithread.code.chapter6.singleton10;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class Singleton10Test {
    public static void main(String[] args){
        Singleton10Thread thread1 = new Singleton10Thread();
        Singleton10Thread thread2 = new Singleton10Thread();
        thread1.start();
        thread2.start();
    }
}

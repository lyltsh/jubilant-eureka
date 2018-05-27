package com.multithread.code.chapter6.singleton9;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class Singleton9Test {
    public static void main(String[] args){
        Singleton9Thread thread1 = new Singleton9Thread();
        Singleton9Thread thread2 = new Singleton9Thread();
        thread1.start();
        thread2.start();
    }
}

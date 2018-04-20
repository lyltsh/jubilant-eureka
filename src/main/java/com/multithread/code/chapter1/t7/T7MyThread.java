package com.multithread.code.chapter1.t7;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class T7MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}

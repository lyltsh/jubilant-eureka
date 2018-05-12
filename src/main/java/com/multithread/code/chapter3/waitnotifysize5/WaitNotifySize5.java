package com.multithread.code.chapter3.waitnotifysize5;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class WaitNotifySize5 {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            Thread ta = new Thread(new WThreadA(lock));
            ta.start();
            Thread.sleep(1000);
            Thread tb = new Thread(new WThreadB(lock));
            tb.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

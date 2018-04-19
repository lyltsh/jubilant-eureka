package com.multithread.code.chapter1.randomThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class RandomThread extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

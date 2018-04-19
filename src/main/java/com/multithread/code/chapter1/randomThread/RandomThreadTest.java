package com.multithread.code.chapter1.randomThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class RandomThreadTest {
    public static void main(String[] args) {
        try {
            RandomThread randomThread = new RandomThread();
            randomThread.setName("randomThread");
            randomThread.run();
            randomThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

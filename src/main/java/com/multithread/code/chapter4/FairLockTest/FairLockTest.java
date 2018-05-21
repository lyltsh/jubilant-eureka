package com.multithread.code.chapter4.FairLockTest;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/22
 */
public class FairLockTest {
    public static void main(String[] args) {
        final FairLockService service = new FairLockService(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread= " + Thread.currentThread().getName() + " run");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}

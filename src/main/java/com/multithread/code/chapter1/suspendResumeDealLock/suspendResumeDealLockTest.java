package com.multithread.code.chapter1.suspendResumeDealLock;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class suspendResumeDealLockTest {
    public static void main(String[] args) {
        try {
            final suspendResumeDealLock object = new suspendResumeDealLock();

            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };

            thread1.setName("a");
            thread1.start();

            Thread.sleep(1000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out
                            .println("thread2 begin");
                    System.out
                            .println("printString() is suspend by a");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

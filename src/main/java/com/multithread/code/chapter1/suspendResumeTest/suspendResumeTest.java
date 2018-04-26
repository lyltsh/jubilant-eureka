package com.multithread.code.chapter1.suspendResumeTest;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class suspendResumeTest {
    public static void main(String[] args) {
        try {
            suspendResume thread = new suspendResume();
            thread.start();
            Thread.sleep(500);
            // A
            thread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i="
                    + thread.getI());
            Thread.sleep(500);
            System.out.println("A= " + System.currentTimeMillis() + " i="
                    + thread.getI());
            // B
            thread.resume();
            Thread.sleep(500);

            // C
            thread.suspend();
            System.out.println("B= " + System.currentTimeMillis() + " i="
                    + thread.getI());
            Thread.sleep(500);
            System.out.println("B= " + System.currentTimeMillis() + " i="
                    + thread.getI());
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

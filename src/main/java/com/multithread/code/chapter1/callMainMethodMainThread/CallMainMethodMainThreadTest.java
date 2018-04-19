package com.multithread.code.chapter1.callMainMethodMainThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class CallMainMethodMainThreadTest {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread();
        thread.start();

        System.out.println(thread.getName());
    }

    private class ThreadRun implements Runnable{

        @Override
        public void run() {

        }
    }
}

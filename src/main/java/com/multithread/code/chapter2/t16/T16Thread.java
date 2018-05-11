package com.multithread.code.chapter2.t16;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/11
 */
public class T16Thread extends Thread {

     private boolean running = true;

    @Override
    public void run() {
        System.out.println("into run method");
        while (running){
            System.out.println("running");
        }
        System.out.println("thread stop");
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}

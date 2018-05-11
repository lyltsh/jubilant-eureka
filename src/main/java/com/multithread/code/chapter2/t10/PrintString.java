package com.multithread.code.chapter2.t10;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/10
 */
public class PrintString implements Runnable {
    private boolean continuePrint = true;

    @Override
    public void run() {
        this.printStringMethod();
    }

    private void printStringMethod() {
        try {
            while (continuePrint) {
                System.out.println("run printStringMethod threadName="
                        + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isContinuePrint() {
        return continuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        this.continuePrint = continuePrint;
    }
}

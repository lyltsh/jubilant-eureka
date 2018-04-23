package com.multithread.code.chapter1.t11;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/23
 */
public class T11Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                Thread.sleep(2000);
                if(this.isInterrupted()){
                    System.out.println("interrupted, quit");
                    break;
                }
                System.out.println("i=" + (i + 1));
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

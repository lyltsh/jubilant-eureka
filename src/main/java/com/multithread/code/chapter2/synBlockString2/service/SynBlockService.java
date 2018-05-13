package com.multithread.code.chapter2.synBlockString2.service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class SynBlockService {

    String anyString = new String();
    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin: " );
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void b(){
        System.out.println("b begin: " );
        System.out.println("b end");
    }
}
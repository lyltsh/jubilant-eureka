package com.multithread.code.chapter2.synNotExtends.service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/7
 */
public class SynNotExtendsSub extends SynNotExtendsMain {
    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub next steep sleep begin threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub next steep sleep end threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

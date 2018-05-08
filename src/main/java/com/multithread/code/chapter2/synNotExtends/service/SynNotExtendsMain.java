package com.multithread.code.chapter2.synNotExtends.service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/7
 */
public class SynNotExtendsMain {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main next steep sleep begin threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main next steep sleep end threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

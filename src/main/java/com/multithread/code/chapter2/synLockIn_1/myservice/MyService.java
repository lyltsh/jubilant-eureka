package com.multithread.code.chapter2.synLockIn_1.myservice;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class MyService {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }

}

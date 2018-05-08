package com.multithread.code.chapter2.doubleSynBlockOneTwo.mythread;

import com.multithread.code.chapter2.doubleSynBlockOneTwo.service.ObjectService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class DoubleSynThreadB extends Thread {
    private ObjectService service;

    public DoubleSynThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}

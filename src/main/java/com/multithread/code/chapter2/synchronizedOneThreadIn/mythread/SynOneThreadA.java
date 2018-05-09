package com.multithread.code.chapter2.synchronizedOneThreadIn.mythread;

import com.multithread.code.chapter2.synchronizedOneThreadIn.service.ObjectService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class SynOneThreadA extends Thread {
    private ObjectService objectService;

    public SynOneThreadA(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}

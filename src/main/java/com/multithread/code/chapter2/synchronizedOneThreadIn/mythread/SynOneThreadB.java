package com.multithread.code.chapter2.synchronizedOneThreadIn.mythread;

import com.multithread.code.chapter2.synchronizedOneThreadIn.service.ObjectService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class SynOneThreadB extends Thread {
    private ObjectService objectService;

    public SynOneThreadB(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}

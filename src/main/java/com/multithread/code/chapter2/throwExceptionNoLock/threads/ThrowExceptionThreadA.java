package com.multithread.code.chapter2.throwExceptionNoLock.threads;

import com.multithread.code.chapter2.throwExceptionNoLock.service.MyService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class ThrowExceptionThreadA extends Thread {
    private MyService myService;

    public ThrowExceptionThreadA(MyService service) {
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        super.run();
        myService.testMethod();
    }
}

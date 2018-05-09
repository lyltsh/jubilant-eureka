package com.multithread.code.chapter2.synchronizedBlockLockAll.test1.thread;

import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.extobject.MyObject;
import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.service.Test1Service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class Test1ThreadA extends Thread {
    private Test1Service service;
    private MyObject object;

    public Test1ThreadA(Test1Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }

}

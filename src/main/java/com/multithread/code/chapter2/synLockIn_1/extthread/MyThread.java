package com.multithread.code.chapter2.synLockIn_1.extthread;

import com.multithread.code.chapter2.synLockIn_1.myservice.MyService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        MyService service = new MyService();
        service.service1();
    }
}

package com.multithread.code.chapter2.throwExceptionNoLock.test;

import com.multithread.code.chapter2.throwExceptionNoLock.service.MyService;
import com.multithread.code.chapter2.throwExceptionNoLock.threads.ThrowExceptionThreadA;
import com.multithread.code.chapter2.throwExceptionNoLock.threads.ThrowExceptionThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/6
 */
public class ThrowExceptionTest {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            ThrowExceptionThreadA a = new ThrowExceptionThreadA(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            ThrowExceptionThreadB b = new ThrowExceptionThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

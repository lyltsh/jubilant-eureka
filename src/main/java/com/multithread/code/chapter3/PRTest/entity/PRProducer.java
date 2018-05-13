package com.multithread.code.chapter3.PRTest.entity;


/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class PRProducer {
    private String lock;

    public PRProducer(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value is: " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

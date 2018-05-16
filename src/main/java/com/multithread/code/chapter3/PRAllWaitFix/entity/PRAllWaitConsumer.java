package com.multithread.code.chapter3.PRAllWaitFix.entity;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class PRAllWaitConsumer {
    private String lock;

    public PRAllWaitConsumer(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 "
                            + Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName()
                        + " RUNNABLE了");
                ValueObject.value = "";
                lock.notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

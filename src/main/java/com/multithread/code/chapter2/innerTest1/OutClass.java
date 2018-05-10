package com.multithread.code.chapter2.innerTest1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/10
 */
public class OutClass {
    static class Inner {
        public void method1() {
//            synchronized ("otherLock") { //异步执行，同步代码块
            synchronized (this){ //同步执行，对象锁
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i="
                            + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }

        public synchronized void method2() {
            for (int i = 11; i <= 20; i++) {
                System.out
                        .println(Thread.currentThread().getName() + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

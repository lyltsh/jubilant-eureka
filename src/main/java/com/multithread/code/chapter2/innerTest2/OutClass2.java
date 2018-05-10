package com.multithread.code.chapter2.innerTest2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/10
 */
public class OutClass2 {
    static class InnerClass1 {
        public void method1(InnerClass2 class2) {
            String threadName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threadName + " into InnerClass1 method1 ");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(threadName + " out InnerClass1 method1 ");
            }
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " into InnerClass1 method2 ");
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
            System.out.println(threadName + " out InnerClass1 method2 ");
        }
    }

    static class InnerClass2 {
        public synchronized void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " into InnerClass2 method1 ");
            for (int k = 0; k < 10; k++) {
                System.out.println("k=" + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
            System.out.println(threadName + " out InnerClass2 method1 ");
        }
    }
}

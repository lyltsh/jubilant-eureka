package com.multithread.code.chapter3.waitnotifysize5;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class WThreadB implements Runnable {
    private Object lock;

    public WThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        //notify执行后，并不是立即释放锁，而是将所在线程synchronized的代码块执行完成才释放锁。
                        System.out.println("send out message");
                    }
                    System.out.println("add " + (i + 1) + " element");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

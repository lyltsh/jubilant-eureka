package com.multithread.code.chapter3.InheritableThreadLocal1.extthread;

import com.multithread.code.chapter3.InheritableThreadLocal1.tools.Tools;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/20
 */
public class Local1ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA value=" + Tools.tl.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

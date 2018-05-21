package com.multithread.code.chapter3.ThreadLocalTest.exthread;

import com.multithread.code.chapter3.ThreadLocalTest.tools.ThreadLocalTools;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class ThreadLocalB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                ThreadLocalTools.tl.set("ThreadB" + (i + 1));
                System.out.println("ThreadB get Value=" + ThreadLocalTools.tl.get());
                Thread.sleep(200);
            }
        } catch (
                InterruptedException e)

        {
            e.printStackTrace();
        }
    }
}

package com.multithread.code.chapter3.ThreadLocalTest;

import com.multithread.code.chapter3.ThreadLocalTest.exthread.ThreadLocalA;
import com.multithread.code.chapter3.ThreadLocalTest.exthread.ThreadLocalB;
import com.multithread.code.chapter3.ThreadLocalTest.tools.ThreadLocalTools;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        try {
            ThreadLocalA threadLocalA = new ThreadLocalA();
            ThreadLocalB threadLocalB = new ThreadLocalB();
            threadLocalA.start();
            threadLocalB.start();

            for (int i = 0; i < 100; i++) {
                ThreadLocalTools.tl.set("Main" + (i + 1));
                System.out.println("Main get Value=" + ThreadLocalTools.tl.get());
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

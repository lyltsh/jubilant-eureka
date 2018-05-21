package com.multithread.code.chapter3.InheritableThreadLocal1;

import com.multithread.code.chapter3.InheritableThreadLocal1.extthread.Local1ThreadA;
import com.multithread.code.chapter3.InheritableThreadLocal1.tools.Tools;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/20
 */
public class InheritableThreadLocal1Test {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main value=" + Tools.tl.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            Local1ThreadA threadA = new Local1ThreadA();
            threadA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

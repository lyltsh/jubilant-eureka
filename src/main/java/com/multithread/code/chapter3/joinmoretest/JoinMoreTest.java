package com.multithread.code.chapter3.joinmoretest;

import com.multithread.code.chapter3.joinmoretest.extthread.JoinSleepThreadA;
import com.multithread.code.chapter3.joinmoretest.extthread.JoinSleepThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class JoinMoreTest {
    public static void main(String[] args) {
        try {
            JoinSleepThreadB threadB = new JoinSleepThreadB();
            JoinSleepThreadA threadA = new JoinSleepThreadA(threadB);

            threadA.start();
            threadB.start();
            threadB.join(2000);
            System.out.println("  main end " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

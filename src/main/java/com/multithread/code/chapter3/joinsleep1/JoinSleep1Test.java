package com.multithread.code.chapter3.joinsleep1;

import com.multithread.code.chapter3.joinsleep1.extthread.JoinSleepThreadA;
import com.multithread.code.chapter3.joinsleep1.extthread.JoinSleepThreadB;
import com.multithread.code.chapter3.joinsleep1.extthread.JoinSleepThreadC;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class JoinSleep1Test {
    public static void main(String[] args) {
        try {
            JoinSleepThreadB threadB = new JoinSleepThreadB();
            JoinSleepThreadA threadA = new JoinSleepThreadA(threadB);
            JoinSleepThreadC threadC = new JoinSleepThreadC(threadB);

            threadA.start();
            Thread.sleep(1000);

            threadC.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

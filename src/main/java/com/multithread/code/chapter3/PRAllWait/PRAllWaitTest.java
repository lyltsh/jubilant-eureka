package com.multithread.code.chapter3.PRAllWait;

import com.multithread.code.chapter3.PRAllWait.entity.PRAllWaitConsumer;
import com.multithread.code.chapter3.PRAllWait.entity.PRAllWaitProducer;
import com.multithread.code.chapter3.PRAllWait.thread.ThreadConsumer;
import com.multithread.code.chapter3.PRAllWait.thread.ThreadProducer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class PRAllWaitTest {
    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");
        PRAllWaitProducer p = new PRAllWaitProducer(lock);
        PRAllWaitConsumer r = new PRAllWaitConsumer(lock);

        ThreadProducer[] pThread = new ThreadProducer[2];
        ThreadConsumer[] rThread = new ThreadConsumer[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadProducer(p);
            pThread[i].setName("生产者" + (i + 1));

            rThread[i] = new ThreadConsumer(r);
            rThread[i].setName("消费者" + (i + 1));

            pThread[i].start();
            rThread[i].start();
        }

        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread()
                .getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " "
                    + threadArray[i].getState());
        }
    }
}

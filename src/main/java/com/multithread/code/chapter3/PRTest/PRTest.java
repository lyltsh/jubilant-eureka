package com.multithread.code.chapter3.PRTest;

import com.multithread.code.chapter3.PRTest.entity.PRConsumer;
import com.multithread.code.chapter3.PRTest.entity.PRProducer;
import com.multithread.code.chapter3.PRTest.thread.ThreadConsumer;
import com.multithread.code.chapter3.PRTest.thread.ThreadProducer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class PRTest {
    public static void main(String[] args){
        String lock = new String ("");
        PRProducer producer = new PRProducer(lock);
        PRConsumer consumer = new PRConsumer(lock);
        Thread pThread = new Thread(new ThreadProducer(producer));
        Thread cThread = new Thread(new ThreadConsumer(consumer));

        pThread.start();
        cThread.start();
    }
}

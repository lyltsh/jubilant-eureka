package com.multithread.code.chapter2.t3.test;

import com.multithread.code.chapter2.t3.entity.PublicVar;
import com.multithread.code.chapter2.t3.extthread.T3Thread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/27
 */
public class T3ThreadRun {
    public static void main(String[] args){
        try {
            PublicVar publicVar = new PublicVar();
            T3Thread t3Thread = new T3Thread(publicVar);
            t3Thread.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

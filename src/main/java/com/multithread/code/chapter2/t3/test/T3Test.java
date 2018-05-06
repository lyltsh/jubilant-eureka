package com.multithread.code.chapter2.t3.test;

import com.multithread.code.chapter2.t3.entity.PublicVar;
import com.multithread.code.chapter2.t3.extthread.T3Thread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/5
 */
public class T3Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            T3Thread thread = new T3Thread(publicVarRef);
            thread.start();

            Thread.sleep(100);//打印结果，受此数值的影响

            publicVarRef.getValue();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

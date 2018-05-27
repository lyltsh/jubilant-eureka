package com.multithread.code.chapter6.singleton9;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class Singleton9Thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(EnumSingleton.connectionFactory.getConnection().hashCode());
        }
    }
}

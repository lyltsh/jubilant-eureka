package com.multithread.code.chapter2.t1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class HasSelfPrivateNum {

    //实例对象，非线程安全
    private int num = 0;

    synchronized public void addI(String username) {
        try {
            //方法变量，线程安全
//            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

package com.multithread.code.chapter2.t3.entity;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/5
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username="
                    + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void getValue() {
        System.out.println("getValue method thread name="
                + Thread.currentThread().getName() + " username=" + username
                + " password=" + password);
    }
}

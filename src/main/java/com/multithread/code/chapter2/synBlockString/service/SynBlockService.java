package com.multithread.code.chapter2.synBlockString.service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class SynBlockService {

    private String usernameParam;
    private String passwordParam;
    String anyString = new String();
    public void setUsernamePassword(String username, String password) {
        try {

            synchronized (anyString) {
                System.out.println("thread name: " + Thread.currentThread().getName()
                        + System.currentTimeMillis() + " in synBlock");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("thread name: " + Thread.currentThread().getName()
                        + System.currentTimeMillis() + " out synBlock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

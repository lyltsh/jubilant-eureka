package com.multithread.code.chapter1.t4.threadsafe.controller;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

     public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if ("a".equals(username)) {
                Thread.sleep(1000);
            }
            passwordRef = password;
            System.out.println(Thread.currentThread().getName()+",username=" + usernameRef + ", password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

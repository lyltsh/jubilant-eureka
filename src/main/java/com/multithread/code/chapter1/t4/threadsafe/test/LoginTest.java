package com.multithread.code.chapter1.t4.threadsafe.test;

import com.multithread.code.chapter1.t4.threadsafe.extthread.ALogin;
import com.multithread.code.chapter1.t4.threadsafe.extthread.BLogin;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class LoginTest {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
//
//        Thread thread = new Thread(aLogin);
//        Thread thread1 = new Thread(bLogin);
//        thread.start();
//        thread1.start();
    }
}

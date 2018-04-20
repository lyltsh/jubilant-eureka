package com.multithread.code.chapter1.t4.threadsafe.extthread;

import com.multithread.code.chapter1.t4.threadsafe.controller.LoginServlet;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}

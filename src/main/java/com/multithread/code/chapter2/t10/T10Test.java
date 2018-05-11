package com.multithread.code.chapter2.t10;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/11
 */
public class T10Test {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString, "printThread").start();
        System.out.println("try to stop the method " + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}

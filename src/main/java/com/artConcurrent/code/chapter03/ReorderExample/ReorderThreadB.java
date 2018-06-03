package com.artConcurrent.code.chapter03.ReorderExample;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/6/2
 */
public class ReorderThreadB extends Thread {
    private ReorderExample example;

    public ReorderThreadB(ReorderExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.reader();
        System.out.println("reader, a:" + example.a);
    }
}

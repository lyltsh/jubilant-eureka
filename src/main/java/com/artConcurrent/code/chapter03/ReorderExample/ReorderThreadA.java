package com.artConcurrent.code.chapter03.ReorderExample;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/6/2
 */
public class ReorderThreadA extends Thread {
    private ReorderExample example;

    public ReorderThreadA(ReorderExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.writer();
        System.out.println("writer, a:" + example.a);
    }
}

package com.artConcurrent.code.chapter03.ReorderExample;

/**
 * @Description: 重排序
 * @Author: leiyulin
 * @date: 2018/6/2
 */
public class ReorderExample {
    int a = 0;
    boolean flag = false;

    public void writer() {
        a++; //1
        flag = true; //2
    }

    public void reader() {
        if (flag) { //3
            int i = a * a; //4
            //s¡­¡­
            System.out.println("reader, i==========:" + i);
            flag =false;
        }
    }
}

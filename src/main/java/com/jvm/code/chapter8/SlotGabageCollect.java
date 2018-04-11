package com.jvm.code.chapter8;

/**
 * @Description: -verbose:gc
 * @Author: leiyulin
 * @date: 2018/4/11
 */
public class SlotGabageCollect {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }

}

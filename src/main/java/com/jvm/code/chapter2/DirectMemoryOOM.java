package com.jvm.code.chapter2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Description: VM Args：-Xmx20M -XX:MaxDirectMemorySize=10M
 * @Author: leiyulin
 * @date: 2018/4/5
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}

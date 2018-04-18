package com.jvm.code.chapter12;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/18
 */
public class FinalTest {
    public static final int ab;
    public final int j;

    static {
        ab = 0;
    }
    {
        j = 1;
    }
}

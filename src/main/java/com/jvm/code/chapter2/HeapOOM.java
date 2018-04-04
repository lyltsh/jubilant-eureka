package com.jvm.code.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Author: leiyulin
 * @date: 2018/4/4
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}

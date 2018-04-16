package com.jvm.code.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/16
 */
public class GenericTypes {
//    public static String method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//        return "";
//    }

    public static int method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list)");
        return 1;
    }

    public static void main(String[] args) {
//        method(new ArrayList<String>());
        method(new ArrayList<Integer>());
    }
}

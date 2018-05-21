package com.multithread.code.chapter3.InheritableThreadLocal1;

import java.util.Date;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/20
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    public Object initialValue(){
        return new Date().getTime();
    }
}

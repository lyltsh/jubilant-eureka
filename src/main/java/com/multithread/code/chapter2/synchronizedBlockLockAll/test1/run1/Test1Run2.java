package com.multithread.code.chapter2.synchronizedBlockLockAll.test1.run1;

import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.extobject.MyObject;
import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.service.Test1Service;
import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.thread.Test1ThreadA;
import com.multithread.code.chapter2.synchronizedBlockLockAll.test1.thread.Test1ThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class Test1Run2 {
    public static void main(String[] args) {
        Test1Service service = new Test1Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        Test1ThreadA a = new Test1ThreadA(service, object1);
        a.setName("a");
        a.start();

        Test1ThreadB b = new Test1ThreadB(service, object2);
        b.setName("b");
        b.start();
    }
}

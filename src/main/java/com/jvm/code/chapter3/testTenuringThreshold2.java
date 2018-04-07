package com.jvm.code.chapter3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/7
 */
public class testTenuringThreshold2 {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution -XX:+UseSerialGC
     *
     */
    @SuppressWarnings("unused")
    public static void doTenuringThreshold2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];   // allocation1+allocation2大于survivo空间一半
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }
    public static void main(String[] args){
        doTenuringThreshold2();
    }
}

/*
[GC (Allocation Failure) [DefNew
Desired survivor size 524288 bytes, new threshold 1 (max 15)
- age   1:    1048568 bytes,    1048568 total
: 7281K->1023K(9216K), 0.0053818 secs] 7281K->5226K(19456K), 0.0054116 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [DefNew
Desired survivor size 524288 bytes, new threshold 15 (max 15)
- age   1:        264 bytes,        264 total
: 5204K->0K(9216K), 0.0026497 secs] 9407K->5204K(19456K), 0.0026902 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
Heap
 def new generation   total 9216K, used 4233K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
  eden space 8192K,  51% used [0x00000007bec00000, 0x00000007bf022630, 0x00000007bf400000)
  from space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400108, 0x00000007bf500000)
  to   space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
 tenured generation   total 10240K, used 5203K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
   the space 10240K,  50% used [0x00000007bf600000, 0x00000007bfb14f28, 0x00000007bfb15000, 0x00000007c0000000)
 Metaspace       used 3287K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 362K, capacity 388K, committed 512K, reserved 1048576K
 */

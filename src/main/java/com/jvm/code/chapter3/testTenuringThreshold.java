package com.jvm.code.chapter3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/7
 */
public class testTenuringThreshold {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution -XX:+UseSerialGC
     */
    @SuppressWarnings("unused")
    public static void doTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];  // 什么时候进入老年代决定于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
    public static void main(String[] args){
        doTenuringThreshold();
    }
}

/* -XX:MaxTenuringThreshold=1
[GC (Allocation Failure) [DefNew
Desired survivor size 524288 bytes, new threshold 1 (max 1)
- age   1:     896832 bytes,     896832 total
: 6861K->875K(9216K), 0.0047388 secs] 6861K->4971K(19456K), 0.0047665 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [DefNew
Desired survivor size 524288 bytes, new threshold 1 (max 1)
- age   1:      24992 bytes,      24992 total
: 5056K->24K(9216K), 0.0017625 secs] 9152K->4866K(19456K), 0.0017819 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
Heap
 def new generation   total 9216K, used 4284K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
  eden space 8192K,  52% used [0x00000007bec00000, 0x00000007bf0290e0, 0x00000007bf400000)
  from space 1024K,   2% used [0x00000007bf400000, 0x00000007bf4061a0, 0x00000007bf500000)
  to   space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
 tenured generation   total 10240K, used 4841K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
   the space 10240K,  47% used [0x00000007bf600000, 0x00000007bfaba6b8, 0x00000007bfaba800, 0x00000007c0000000)
 Metaspace       used 3298K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 363K, capacity 388K, committed 512K, reserved 1048576K
 */

/* -XX:MaxTenuringThreshold=15
[GC (Allocation Failure) [DefNew
Desired survivor size 524288 bytes, new threshold 1 (max 15)
- age   1:     899056 bytes,     899056 total
: 6861K->877K(9216K), 0.0052364 secs] 6861K->4974K(19456K), 0.0052661 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [DefNew
Desired survivor size 524288 bytes, new threshold 15 (max 15)
- age   1:        120 bytes,        120 total
: 5058K->0K(9216K), 0.0014360 secs] 9154K->4843K(19456K), 0.0014555 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
Heap
 def new generation   total 9216K, used 4315K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
  eden space 8192K,  52% used [0x00000007bec00000, 0x00000007bf036e98, 0x00000007bf400000)
  from space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400078, 0x00000007bf500000)
  to   space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
 tenured generation   total 10240K, used 4843K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
   the space 10240K,  47% used [0x00000007bf600000, 0x00000007bfabaee8, 0x00000007bfabb000, 0x00000007c0000000)
 Metaspace       used 3285K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 362K, capacity 388K, committed 512K, reserved 1048576K

Process finished with exit code 0
 */
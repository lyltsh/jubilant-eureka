package com.jvm.code.chapter9;

/**
 * @Description: 修改Class文件，暂时只提供修改常量池常量的功能
 * @Author: leiyulin
 * @date: 2018/4/14
 */
public class ClassModifier {

    /**
     * Class文件中常量池的起始偏移
     */
    private static final int CONSTANT_POOL_COUNT_INDEX = 8;

    /**
     * CONSTANT_Utf8_info常量的tag标志
     */
    private static final int CONSTANT_Utf8_info = 1;

    /**
     * 常量池中11种常量所占的长度，CONSTANT_Utf8_info型常量除外，因为它不是定长的
     */
    private static final int[] CONSTANT_ITEM_LENGTH = {-1, -1, -1, 5, 5, 9, 9, 3, 3, 5, 5, 5, 5};

    private static final int u1 = 1;
    private static final int u2 = 2;

    private byte[] classByte;

    public ClassModifier(byte[] classByte) {
        this.classByte = classByte;
    }

    /**
     * 修改常量池中CONSTANT_Utf8_info常量的内容
     *
     * @param oldStr 修改前的字符串
     * @param newStr 修改后的字符串
     * @return 修改结果
     */
    public byte[] modifyUTF8Constant(String oldStr, String newStr) {
        int cpc = getConstantPoolCount();
        int offset = CONSTANT_POOL_COUNT_INDEX + u2;
        for (int i = 0; i < cpc; i++) {
            //取出CONSTANT_UTF8_info中标志部分
            int tag = ByteUtils.bytes2Int(classByte, offset, u1);
            //判断是否为CONSTANT_UTF8_info数据类型
            if (tag == CONSTANT_Utf8_info) {
                int len = ByteUtils.bytes2Int(classByte, offset + u1, u2);
                //取出CONSTANT_UTF8_info中字符串的长度
                offset += (u1 + u2);
                //取出CONSTANT_UTF8_info中的字符串部分
                String str = ByteUtils.bytes2String(classByte, offset, len);
                //通过字符串部分比较是否为需要修改的CONSTANT_UTF8_info
                if (str.equalsIgnoreCase(oldStr)) {
                    //将新字符串的值打散成字节数组
                    byte[] strBytes = ByteUtils.string2Bytes(newStr);
                    //将表示字符串长度值的两个字节分别以16进制的形式装在字节数组中
                    byte[] strLen = ByteUtils.int2Bytes(newStr.length(), u2);
                    //将CONSTANT_UTF8_info中表示length部分进行替换
                    classByte = ByteUtils.bytesReplace(classByte, offset - u2, u2, strLen);
                    //将CONSTANT_UTF8_info中字符串部分进行替换
                    classByte = ByteUtils.bytesReplace(classByte, offset, len, strBytes);
                    return classByte;
                    //如不是需要修改的CONSTANT_UTF8_info，则跳过这个类型，接着循环
                } else {
                    offset += len;
                }
                //如果不是CONSTANT_UTF8_info数据类型，根据tag跳转CONSTANT_ITEM_LENGTH中定义的字节数
            } else {
                offset += CONSTANT_ITEM_LENGTH[tag];
            }
        }
        return classByte;
    }

    /**
     * 获取常量池中常量的数量
     *
     * @return 常量池数量
     */
    public int getConstantPoolCount() {
        return ByteUtils.bytes2Int(classByte, CONSTANT_POOL_COUNT_INDEX, u2);
    }
}

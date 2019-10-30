package com.banyuan.test1030;

/**
 * @author CXY
 * @date 2019-10-30 16:16
 * 描述信息：测试StringBuilder,StringBuffer 可变字符序列
 */
public class Test03 {
    public static void main(String[] args) {
String str;
//StringBuilder 线程不安全，效率高，StringBuffer 线程安全，效率低
        StringBuilder stringBuilder=new StringBuilder("abcdefg");
        System.out.println("原来的哈希值");
        System.out.println(Integer.toHexString((stringBuilder.hashCode())));
        System.out.println("原来的值");
        System.out.println(stringBuilder);

        stringBuilder.setCharAt(2, 'M');
        System.out.println("改变后的哈希值");
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));
        System.out.println("改变后的值");
        System.out.println(stringBuilder);
    }
}

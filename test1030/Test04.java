package com.banyuan.test1030;

/**
 * @author CXY
 * @date 2019-10-30 16:25
 * 描述信息：测试StringBuffer,StringBuilder 的常用方法
 */
public class Test04 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char temp = (char) ('a' + i);
            stringBuilder.append(temp);
        }
        System.out.println("stringBuilder的值为：" + stringBuilder);
        System.out.println("倒序后值：");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(3, '陈');
        System.out.println("改变后的stringBuilder值：" + stringBuilder);
        //链式调用
        stringBuilder.insert(6, '小').insert(9, '雨').insert(12, '!');
        System.out.println("改变后的stringBuilder值：" + stringBuilder);
        //删除元素
        stringBuilder.delete(20, 23);
        System.out.println("改变后的stringBuilder值：" + stringBuilder);
    }
}

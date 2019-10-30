package com.banyuan.test1030;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXY
 * @date 2019-10-30 21:15
 * 描述信息：ArrayList 基本增删查改
 */
public class Test16 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        boolean success=list.add("王一博");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        //判断是否添加成功
        System.out.println(success);
        //打印集合
        System.out.println(list);
        //获取元素
        String getE=list.get(0);
        System.out.println("获取到的元素是："+getE);
        //获取集合长度
        int size=list.size();
        System.out.println("集合长度是："+size);
        // 添加元素到指定位置
        list.add(4, "d");
        System.out.println(list);
        // 移除元素
        String removeE = list.remove(0);
        System.out.println("被移除的元素是：" + removeE);
        System.out.println(list);
        // 替换元素（把a替换为A)
        String setE = list.set(4, "A");
        System.out.println("被替换的元素是" + setE);
        System.out.println(list);
        // 遍历list(list.get())
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s);
        }
    }
}

package com.banyuan.test1030;

import java.util.LinkedList;

/**
 * @author CXY
 * @date 2019-10-30 21:28
 * 描述信息：LinkedList 基本增删
 */
public class Test17 {
    public static void main(String[] args) {
        // 创建LinkedList对象，不能用多态
        LinkedList ll = new LinkedList();
        // 添加元素到开头
        ll.addFirst("hello");
        // 添加元素到结尾
        ll.addLast("world");
        // 添加元素到指定位置
        ll.add(1, "hi");
        // 打印集合：[hello, hi, world]
        System.out.println(ll);

        // 添加元素到开头，底层源代码就是addFirst
        ll.push("china");
        System.out.println(ll);

        // 删除第一个元素
        ll.removeFirst();
        System.out.println(ll);
        //删除最后一个元素
        ll.removeLast();
        System.out.println(ll);
        // 删除第一个元素，底层源码就是removeFirst
        ll.pop();
        System.out.println(ll);

    }
}

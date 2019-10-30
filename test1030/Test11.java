package com.banyuan.test1030;

import java.util.Random;

/**
 * @author CXY
 * @date 2019-10-30 19:26
 * 描述信息：Random 类的使用
 */
public class Test11 {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("随机生成[0,1)之间的double 类型的数据");
        System.out.println(random.nextDouble());
        System.out.println("随机生成int类型允许范围内的数据");
        System.out.println(random.nextInt());
        System.out.println("随机生成[0,1)之间的float 类型的数据");
        System.out.println(random.nextFloat());
        System.out.println("随机生成false或true");
        System.out.println(random.nextBoolean());
        System.out.println("随机生成[0,10)之间的int 类型的数据");
        System.out.println(random.nextInt(10));
        System.out.println("随机生成[20,30)之间的int 类型的数据");
        System.out.println(20+random.nextInt(10));
    }
}

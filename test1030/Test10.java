package com.banyuan.test1030;

/**
 * @author CXY
 * @date 2019-10-30 19:09
 * 描述信息：Math类的方法
 */
public class Test10 {
    public static void main(String[] args) {
        //取整相关的操作
        System.out.println("对值取整：");
        System.out.println(Math.ceil(3.2));
        System.out.println(Math.floor(3.2));
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.8));
        //绝对值、开方、a的b次幂
        System.out.println("绝对值、开方、a的b次幂");
        System.out.println(Math.abs(-45));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.pow(2,5));
        //Math类中的常用的常量
        System.out.println("常用的常量");
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //随机数 [0,1)
        System.out.println("随机数 [0,1)");
        System.out.println(Math.random());
    }
}

package com.banyuan.test1030;

/**
 * @author CXY
 * @date 2019-10-30 15:23
 * 描述信息：Integer 类的使用
 */
public class Test01 {
    public static void main(String[] args) {
       //基本数据类型转换成包装类
        Integer a=new Integer(3);
        Integer b=Integer.valueOf(30);
        System.out.println("a="+a+",b="+b);
        //包装类对象转换成基本数据类型
        int c=b.intValue();
        double d=b.doubleValue();
        System.out.println("c="+c+",d="+d);
        //字符串转换成包装类型
        Integer e=new Integer("6666");
        Integer f=Integer.parseInt("666888");
        System.out.println("e="+e+",f="+f);
        //包装类转换成字符串
        String str=f.toString();
        System.out.println("str="+str);
        //常见的常量
        System.out.println("int类型的最大整数："+Integer.MAX_VALUE);
    }
}

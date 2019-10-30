package com.banyuan.test1030;

/**
 * @author CXY
 * @date 2019-10-30 16:01
 * 描述信息：String 常用方法
 */
public class Test02 {
    public static void main(String[] args) {
        String str="HelloWorld";
        //以旧换新
        String str2=str.replace("World","China");
        System.out.println("str="+str);
        System.out.println("换新后：");
        System.out.println("str2="+str2);
        //分割字符串
        String str3="zhangsan/lisi/wangwu";
        String str4[] =str3.split("/");
        System.out.println("分割后：");
        for(String s:str4){
            System.out.println(s);
        }
        //判断字符是否以指定字符开头
        String str5="Test01.java";
        String str6="Person.java";
        boolean b1=str5.startsWith("T");
        System.out.println("是否以T开头"+b1);
        //判断字符是否以指定字符结尾
        boolean b2=str6.endsWith("Java");
        //方法严格区分大小写
        System.out.println("是否以Java结尾"+b2);
        //去除开头结尾空格
        String str7="    zhangsan    lisi    ";
        String str8=str7.trim();
        System.out.println(str7);
        System.out.println("去掉首位空格后：");
        System.out.println(str8);
    }
}

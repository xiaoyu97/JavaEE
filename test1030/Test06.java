package com.banyuan.test1030;

import java.time.DayOfWeek;
import java.util.Date;

/**
 * @author CXY
 * @date 2019-10-30 16:49
 * 描述信息：测试Date 的常见用法
 */
public class Test06 {
    public static void main(String[] args) {
        Date date=new Date(2000);
        System.out.println(date);
        //返回：1970 年 1 月 1 日到参数之间的毫秒数
        System.out.println(date.getTime());
        Date date1=new Date();
        System.out.println(date1.getTime());
        System.out.println(date1.after(date));
        //比参数多一个月
        Date date2=new Date(2020-1900,3,10);
        System.out.println(date2);
    }
}

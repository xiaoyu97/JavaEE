package com.banyuan.test1030;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author CXY
 * @date 2019-10-30 17:10
 * 描述信息：测试日期类的使用
 */
public class Test08 {
    public static void main(String[] args) {
        //获得日期相关的元素
        Calendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
        int year = calendar.get(Calendar.YEAR);
        //返回0～11，0表示1月
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        //注意；这里返回的 1 是周日
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("周：" + week);
        System.out.println("日：" + day);
        //设置日期相关的元素
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, 9012);
        System.out.println("指定的日期是" + calendar1);
        //日期计算
        Calendar calendar2 = new GregorianCalendar();
        calendar2.add(Calendar.YEAR, -100);
        System.out.println("减去100年后：" + calendar2);
        //日期对象和时间对象的转化
        Date date = calendar2.getTime();
        Calendar calendar3 = new GregorianCalendar();
        calendar3.setTime(new Date());
        System.out.println(calendar3);
        printCalendar(calendar3);
    }

    public static void printCalendar(Calendar c) {
        //打印：1918年10月10日 11:23:45 周三
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int dayweek = c.get(Calendar.DAY_OF_WEEK) - 1;
        String dayweek2 = dayweek == 0 ? "日" : dayweek + "";

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "年" + month + "月" + date + "日 " + hour + "时" + minute + "分" + second + "秒"
                + "   周" + dayweek2);

    }
}
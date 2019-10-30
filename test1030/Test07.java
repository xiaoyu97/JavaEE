package com.banyuan.test1030;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author CXY
 * @date 2019-10-30 16:57
 * 描述信息：测试时间对象和字符串之间的相互转换
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 */
public class Test07 extends DataFormat{
    public static void main(String[] args) {
//把时间对象按照指定格式转换成相应的字符串
        DateFormat dataFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=dataFormat.format(new Date(4000000));
        System.out.println("4000000的时间为："+str);
        //把字符串按照指定格式转成相应的时间对象
        SimpleDateFormat dataFormat1=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        try {
            Date date=dataFormat1.parse("1983年5月10日 10时45分59秒");
            System.out.println(date);
            //测试其他格式字符：D获得时间时所处年份的第几天
            DateFormat dateFormat3=new SimpleDateFormat("D");
            String str3=dateFormat3.format(new Date());
            System.out.println("今天是这一年的第"+str3+"天！");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

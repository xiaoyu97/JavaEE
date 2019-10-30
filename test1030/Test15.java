package com.banyuan.test1030;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

/**
 * @author CXY
 * @date 2019-10-30 20:52
 * 描述信息：重写 equals 和 hashCode 方法
 */
public class Test15 {
    public static void main(String[] args) {

        User user1 = new User("1", "xiaohua", "14");
        User user2 = new User("2", "xiaohua", "14");
        System.out.println(user1.equals(user2));
    }
}
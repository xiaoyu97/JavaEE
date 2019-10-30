package com.banyuan.test1030;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author CXY
 * @date 2019-10-30 19:33
 * 描述信息：测试File类的基本用法
 */
public class Test12 {
    public static void main(String[] args) {
        File f=new File("./a.text");
        System.out.println(f);
        f.renameTo(new File("./b.text"));

        System.out.println(System.getProperty("user.dir"));

        try {
        File f2=new File("aa.text");
            f2.createNewFile();
            System.out.println("File是否存在："+f2.exists());
            System.out.println("File是否是目录："+f2.isDirectory());
            System.out.println("File是否是文件："+f2.isFile());
            System.out.println("File最后修改时间："+new Date(f2.lastModified()));
            System.out.println("File的大小："+f2.length());
            System.out.println("File的文件名："+f2);
            System.out.println("File的文件路径："+f2.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

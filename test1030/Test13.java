package com.banyuan.test1030;

import java.io.File;

/**
 * @author CXY
 * @date 2019-10-30 19:53
 * 描述信息：使用递归算法打印目录树
 */
public class Test13 {
    public static void main(String[] args) {
        File f=new File("a");
        Test13.printFile(f,0);
    }
    static void printFile(File file,int level){
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files=file.listFiles();

            for(File temp:files){
                printFile(temp ,level+1);
            }
        }
    }
}

package com.banyuan.test1030;

/**
 * @author CXY
 * @date 2019-10-30 16:35
 * 描述信息：测试可变字符序列和不可变字符序列使用的陷阱
 */
public class Test05 {
    public static void main(String[] args) {
        //使用String进行字符串拼接
        String str="";
        //本质上使用String拼接，但每次循环都会生成String对象
        long num1=Runtime.getRuntime().freeMemory();
        System.out.println("系统剩余内存："+num1);
        long time1=System.currentTimeMillis();
        System.out.println("现在时间："+time1);
        for(int i=0;i<5000;i++){
            str+=i;
        }
        long num2=Runtime.getRuntime().freeMemory();
        System.out.println("系统现在剩余内存："+num2);
        long time2=System.currentTimeMillis();
        System.out.println("现在时间："+time2);
        System.out.println("String 占用空间："+(num1-num2));
        System.out.println("String 占用时间："+(time2-time1));

        //StringBuilder 拼接
        StringBuilder stringBuilder=new StringBuilder("");
        long num3=Runtime.getRuntime().freeMemory();
        System.out.println("系统剩余内存："+num3);
        long time3=System.currentTimeMillis();
        System.out.println("现在时间："+time3);
        for(int i=0;i<5000;i++){
            str+=i;
        }
        long num4=Runtime.getRuntime().freeMemory();
        System.out.println("系统现在剩余内存："+num4);
        long time4=System.currentTimeMillis();
        System.out.println("现在时间："+time4);
        System.out.println("StringBuilder 占用空间："+(num3-num4));
        System.out.println("StringBuilder 占用时间："+(time4-time3));
    }
}

package com.ron.test;

public class Test5 {
    public static void main(String[] args) {
        //1.三个和尚身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 175;
        //2.比较身高
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        //ctrl + alt + L, 可以自动格式化代码
        //3.打印结果
        System.out.println(max);
    }
}

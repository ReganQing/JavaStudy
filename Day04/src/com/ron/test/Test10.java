package com.ron.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //给你一个整数x,如果x是一个回文整数，打印true，否则返回false
        //回文就是无论正序还是倒叙数字本身并不会改变，如121

        //1.键盘录入一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x = sc.nextInt();
        //记录输入的数字
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;
        //2.利用循环开始
        while(x != 0){
            //提取数字的每一位
            int result = x % 10;
            //修改x记录的值
            x = x / 10;
            //把当前获取到的数字拼接起来
            num = num * 10 + result;
        }
        //3.打印num
        System.out.println(num);
        //4.比较
        System.out.println(num == temp);
    }
}

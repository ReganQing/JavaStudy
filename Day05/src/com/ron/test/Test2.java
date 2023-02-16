package com.ron.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
        结果只保留整数部分，小数部分将被舍去。
         */

        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        //2.计算平方根并返回整数部分
        for (int i = 1; i <= num; i++) {
            if (i * i == num){
                System.out.println(i + "是" + num + "平方根的整数部分");
                break;//一旦找到循环就可以停止了，节省计算机的资源，提高效率
            } else if (i * i > num) {
                System.out.println(i - 1 + "是" + num + "平方根的整数部分");
                break;
            }
        }
    }
}

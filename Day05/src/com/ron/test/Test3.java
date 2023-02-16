package com.ron.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数x,判断该整数是否为一个质数

        //定义一个变量，表示标记number是否为一个质数
        boolean flag = true;
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数");
        int num = sc.nextInt();
        //2.判断该数是否为质数
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                //System.out.println(num + "不是质数");
                break;
            }/*else {
                System.out.println(num + "是质数");
            }*/
        }
        if(flag){
            System.out.println(num + "是质数");
        }else {
            System.out.println(num + "不是质数");
        }
    }
}


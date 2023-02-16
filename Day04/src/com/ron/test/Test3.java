package com.ron.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //判断影票序号，奇数坐左侧，偶数坐右侧
        //1.键盘输入一个1~100的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票序号");
        int ticket = sc.nextInt();

        //2.判断票号是奇数还是偶数，并打印结果
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 0) {
                System.out.println("请坐右侧");
            } else {
                System.out.println("请坐左侧");
            }
        }else{
            System.out.println("请输入正确的电影票序号");
        }
    }
}

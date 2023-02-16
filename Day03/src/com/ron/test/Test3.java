package com.ron.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //1.键盘录入两个整数a和b
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        //2.判断其中一个是否为6的或者两数之和是否为6的倍数
        boolean result = number1 == 6 || number2 == 6 || number1 + number2==6;
        
        //3.打印结果
        System.out.println(result);
    }
}

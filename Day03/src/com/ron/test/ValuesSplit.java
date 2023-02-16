package com.ron.test;

import java.util.Scanner;

public class ValuesSplit {
    //主入口
    public static void main(String[] args) {
        //数值拆分，键盘输入一个三位数，获取其中的个位，十位，百位

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        int number = sc.nextInt();

        //2.获取个位，十位，百位
        int oneBit = number % 10;
        int tenBit = number / 10 % 10;
        int hundBit = number / 100 % 10;

        System.out.println("个位数字为：" + oneBit);
        System.out.println("十位数字为：" + tenBit);
        System.out.println("百位数字为：" + hundBit);
    }

}

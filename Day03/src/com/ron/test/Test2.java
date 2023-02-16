package com.ron.test;

import java.util.Scanner;

public class Test2 {
    //主入口
    public static void main(String[] args) {
        //1.键盘录入两个整数表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的时装时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion = sc.nextInt();

        //2.把我衣服的时髦度跟女孩的时髦度进行对比
        boolean result = myFashion > girlFashion;

        //3.打印结果
        System.out.println(result);
    }
}

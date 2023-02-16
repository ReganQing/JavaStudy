package com.ron.test;

public class Test1 {
    public static void main(String[] args) {
        /*
        逢7过，使用程序在控制台打印出1~100之间的满足逢7必过的数据
         */

        /*1.键盘录入数据范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个起始值");
        int start = sc.nextInt();
        System.out.println("请输入临界值");
        int end = sc.nextInt();
        int i = start;

         */
        //判断是否是7的倍数
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0 || i % 10 ==7 || i /10 % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}

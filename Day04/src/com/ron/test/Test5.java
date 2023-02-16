package com.ron.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
       /*
       商场根据不同会员等级打不同折扣
        */
        //1.定义变量记录总价
        int price = 1000;
        //2.键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入会员级别");
        int vip = sc.nextInt();
        //3.根据级别来计算实际要支付的钱
        if(vip == 1){
            System.out.println("实际支付的钱为：" + price*0.9);
        } else if (vip == 2) {
            System.out.println("实际支付的钱为：" + price*0.8);
        } else if (vip == 3) {
            System.out.println("实际支付的钱为：" + price*0.7);
        }else {
            System.out.println("实际支付的钱为：" + price);
        }
    }
}

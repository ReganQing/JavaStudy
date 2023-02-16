package com.ron.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*卖飞机票
        需求：机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份
        和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5~10月）头等舱9折，经济舱8.5折，淡季
        （11月到来年4月）头等舱7折，经济舱6.5折。
         */

        //1.键盘录入淡季/旺季、月份、头等舱/经济舱

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double ticketPrice = sc.nextDouble();
        System.out.println("请输入您购买的机票的月份，1~12");
        int month = sc.nextInt();
        System.out.println("请输入您选择的舱位类型, 0:头等舱,1:经济舱");
        int type = sc.nextInt();

        //2.根据录入的数据来判断机票价格
        //先判断是旺季还是淡季
        //接着判断是头等舱还是经济舱
        //最后计算价格
        while (month > 0 && month <= 12) {
            if (month >= 5 && month <= 11) {
                ticketPrice = getPrice(ticketPrice, month, 0.9, 0.85, type);
            } else {
                ticketPrice = getPrice(ticketPrice, month, 0.7, 0.65, type);
            }
            System.out.println("折后机票价格为" + ticketPrice);
            break;
        }
    }
    //ctrl + alt + M 可以自动抽取方法
    //定义方法
    //1.我要干嘛？   求得折扣后的机票价格
    //2.我需要什么？  需要ticketPrice：机票原价，month：月份，v0、v1：淡/旺季折扣信息,type：舱位类型
    //3.需不需要返回值？    需要返回折后价格
    public static double getPrice(double ticketPrice, int month, double v0, double v1, int type) {
        if (type == 0) {
            ticketPrice = ticketPrice * v0;  //得到新的机票价格
        } else if (type == 1) {
            ticketPrice = ticketPrice * v1;
        }
        return ticketPrice;
    }
}
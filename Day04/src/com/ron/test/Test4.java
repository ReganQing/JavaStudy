package com.ron.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //根据不同的分数送不同的礼物

        //1.键盘录入小明的分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入小明的成绩");
        int score = sc.nextInt();
        //2.判断小明的分数成处于哪个区间
        //对异常数据进行判断校验
        if(score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("当前录入的成绩不合理，请重新录入成绩");
        }
    }
}

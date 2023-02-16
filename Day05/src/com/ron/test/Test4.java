package com.ron.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1~100之间的随机数字，使用程序实现猜出这个数字是多少
        //可以加一个保底机制
        //1.导包  2.创建对象  3.生成随机数
        Random r = new Random();
        int num = r.nextInt(100) + 1;//1~100
        //定义一个计数器，用来记录猜数字的次数
        int count = 3;
        //用来生成任意数到任意数范围的随机数
        /*
        生成7~17之间的随机数
        1.让这个范围头尾都减去一个数，让这个范围从0开始  17-7=10， 0~10
        2.尾巴+1  10 + 1 = 11
        3.最终的结果，再加上第一步减去的值。
         */
        //2，猜数字，三种情况，大了，小了，猜中了
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你要猜的数字");
            int guessNum = sc.nextInt();
            count++;
            if (count == 3){
                System.out.println("猜中了");
                break;
            }
            if (guessNum > num) {
                System.out.println("大了");
            } else if (guessNum < num) {
                System.out.println("小了");

            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}

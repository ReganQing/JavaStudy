package com.ron.ifdemo;

import java.util.Scanner;

public class ifdemo {
    public static void main(String[] args) {
        //if语句
        /*
        if(关系表达式){
            语句体；
        }
        if的注意点：
            1.大括号的开头可以另起一行书写，但是建议写在第一行末尾
            2.在语句体中，如果只有一句代码，大括号可以省略不写。尽量不要省略
            3.如果对一个布尔类型的变量进行判断，不要用==号，直接把变量写在小括号里即可
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量");
        int drinkQ = sc.nextInt();
        //判断酒量是否达到老丈人的满意程度
        if (drinkQ > 2){
            System.out.println("满意");
        }
        else{
            System.out.println("不满意");
        }
    }
}

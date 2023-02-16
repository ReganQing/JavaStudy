package com.ron.ternaryoperator;

public class Ternaryoperator {
    public static void main(String[] args) {
        //需求：使用三元运算符，获取两个数的较大值

        //1.定义两个变量记录两个整数
        int number1 = 10;
        int number2 = 20;

        //2.使用三元运算符获取两个整数的较大者

        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);
    }
}

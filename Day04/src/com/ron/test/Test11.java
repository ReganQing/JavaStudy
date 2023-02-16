package com.ron.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*给定两个整数，被除数和除数（都是正数，且不超过int的范围）
        将两数相除，要求不使用乘法、除法和%运算符，得到商和余数

        分析： 被除数 / 除数 = 商···余数
         */

        //1.输入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int num1 = sc.nextInt();
        System.out.println("请输入除数");
        int num2 = sc.nextInt();
        //定义一个表示商的变量，即做减法的次数
        int count = 0;
        //2.while循环做减法，用被除数减去除数，每减一次count+1,一直到减到被除数<=0为止
        while(num1 >= 0){
            num1 = num1 -num2;
            count++;
            if(num1 < num2 && num1 > 0){
                count = count - 1;
                System.out.println("余数为" + num1);
            }

        }
        //3.打印count，最后的被除数如果不能被满减则打印最后那个
        System.out.println("商为" + count);
    }
}

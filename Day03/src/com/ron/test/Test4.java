package com.ron.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //1.键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的重量");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的重量");
        int weight2 = sc.nextInt();

        //2.判断两只老虎的体重是否相同
        String result = weight1 == weight2 ? "相同" : "不同";
        //3.打印结果
        System.out.println(result);
    }
}

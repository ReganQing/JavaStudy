package com.ron.test;

public class Test7 {
    public static void main(String[] args) {
        //1~5累加和

        //1.循环执行五次累加操作
        int sum = 0;
        for(int i = 1; i < 6; i++){
            sum = i + sum;

        }
        //2.打印累加和
        System.out.println(sum);
    }
}

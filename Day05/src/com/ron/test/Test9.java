package com.ron.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*
        需求：生成10个1~100之间的随机数存入数组
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小
         */

        //1.定义随机数数组,并把随机数存入到数组当中
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        //1）求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组和为" + sum);
        //2）求所有数据的平均数
        double ave = (double)sum / arr.length;
        System.out.println("所有数据的平均数为" + ave);

        //3）统计有多少个数据比平均值小
        //定义一个统计量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ave) {
                count++;
            }
        }
        //打印统计变量
        System.out.println("共有" + count + "个数比平均数小");

        //遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //打印去掉ln表示不换行
        }
    }
}

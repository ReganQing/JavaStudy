package com.ron.test;

public class Test8 {
    public static void main(String[] args) {
        //定义数组求最大值

        //1，定义数组用来存储5个值
        int[] arr = {33,5,22,44,55};
        //2.定义一个变量max用来存储最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        //打印最大值
        System.out.println("最大值为" + max);
    }
}

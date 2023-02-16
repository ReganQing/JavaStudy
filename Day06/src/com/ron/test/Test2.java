package com.ron.test;

public class Test2 {
    public static void main(String[] args) {
        //数组遍历，需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。
        int[] arr = {11, 22, 33, 44, 55};
        getArr(arr);
    }

    public static void getArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}

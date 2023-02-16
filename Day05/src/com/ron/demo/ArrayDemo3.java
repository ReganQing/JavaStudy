package com.ron.demo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //数组遍历
        //在Java当中，关于数组的一个长度属性，length
        //调用方式： 数组名.length
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package com.ron.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法copyOfRange(int[] arr,int from,int to)
        功能：将数组arr中从索引from（包含from）开始。到索引to结束（不包含to）
        的元素复制到新数组中，将新数组返回。
        */
        int[] arr = {12, 23, 9, 18, 28, 78};
        getArr(arr, 2, 5);
    }

    //定义方法
    //1.我要干嘛？
    //2.我需要什么？新的数组、from、to
    public static void getArr(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        for (int i = from, j = 0; i < to; i++, j++) {   //j为伪造索引，用一次加 一次
            newArr[j] = arr[i];
        }
        //打印新数组
        System.out.print("[");
        for (int i = 0; i < newArr.length; i++) {
            if (i == newArr.length - 1) {
                System.out.print(newArr[i]);
            } else {
                System.out.print(newArr[i] + ",");
            }
        }
        System.out.print("]");
    }
}

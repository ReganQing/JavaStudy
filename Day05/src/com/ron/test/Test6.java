package com.ron.test;

public class Test6 {
    public static void main(String[] args) {
        /*
        定义一个数组，存储1~10，遍历数组得到每一个元素，统计数组里面一共有
        多少个能被3整除的数字
         */

        //1.定义一个数组存储1~10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组里面的每一个元素，并统计能被3整除的数字
        int count = 0;  //定义一个统计量
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                count++;
            }
        }
        //打印统计结果
        System.out.println("数组中一共有" + count + "个数能被3整除");
    }
}

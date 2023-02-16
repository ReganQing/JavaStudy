package com.ron.demo;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //二维数组的创建和索引遍历
        //每一个一维数组其实是二维数组中的元素，所以每一个一维数组之间需要用逗号隔开
        //最后一个一维数组后面不需要加逗号
        int[][] arr = {
                {12,143,124},
                {1,14,45}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();   //换行打印一维数组元素
        }

    }
}

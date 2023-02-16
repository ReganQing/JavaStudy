package com.ron.test;

public class Test9 {
    public static void main(String[] args) {
        /*
        某商城每个季度的营业额如下（万元）：
        第一季度：22，66，44
        第二季度：77，33，88
        第三季度：25，45，65
        第四季度：11，66，99

        要求：计算出每个季度的总营业额和全年的总营业额
         */

        //1.创建二维数组并存储数据
        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        //2.遍历每个季度的营业额并计算总营业额
        int profitYear = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int profitSum = 0;
            for (int j = 0; j < yearArrArr[i].length; j++) {
                profitSum = profitSum + yearArrArr[i][j];
            }
            profitYear = profitYear + profitSum;

            System.out.println("第" + (i + 1) + "季度总营业额为：" + profitSum);
        }
        System.out.println("年总营业额为：" + profitYear);

    }
}

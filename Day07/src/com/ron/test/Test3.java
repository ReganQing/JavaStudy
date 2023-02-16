package com.ron.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        在歌唱比赛中，有6名评委给选手打分，分数范围是[0,100]的整数，
        选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请
        完成上述过程并计算选手的得分。
         */

        //分析
        //1.定义一个数组，用来存储6名评委的打分（0~100）
        int[] scoreArr = getScores();
        //2.求出数组中的最大值
        int max = getMax(scoreArr);
        //3.求出数组中的最小值
        int min = getMin(scoreArr);
        //4.求出数组中6个分数的总和
        int sum = getSum(scoreArr);
        //5.（总和 - 最大值 - 最小值） / 4
        int ave = 0;
        ave = (sum - max - min) / 4;

        System.out.println("平均分为" + ave);
    }
    //求数组最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > scoreArr[0]) {
                max = scoreArr[i];
            }
        }
        return max;
    }
    //求数组最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < scoreArr[0]) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //求出数组中6个分数的总和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }
    //1.我要干嘛？返回评委评分数组
    //2.我需要什么？不需要传入任何参数
    //3.需要返回值吗？需要返回评委评分数组

    public static int[] getScores() {
        int[] scoreArr = new int[6];
        for (int i = 0; i < scoreArr.length; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请评委打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scoreArr[i] = score;
                i++;
            } else {
                System.out.println("评分超出范围，请重新打分");
            }
        }
        return scoreArr;
    }
}

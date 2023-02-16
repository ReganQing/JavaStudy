package com.ron.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求：一个大V直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}
        五个金额。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
         */
        //1.定义一个数组表示奖池
        int[] arr = {2,588,888,1000,10000};
        //2.定义新数组存储抽奖结果
        int[] newArr = new int[arr.length];

        //3.抽奖
        Random r = new Random();
        for (int i = 0; i < 5;) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖金
            int prize = arr[randomIndex];
            //判断当前的奖项是否存在，如果存在则果断抽取，不存在就表示是有效奖项
            boolean flag = contains(prize, arr);
            if (!flag){
                //把当前抽取到的奖项添加到newArr中
                newArr[i] = prize;
                //添加完毕之后，移动索引
                i++;
            }
        }
        //4.遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //写一个方法判断抽到的奖金是否已被抽到
    public static boolean contains(int prize,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (prize == arr[i]){
                return true;
            }
        }
        return false;
    }
}

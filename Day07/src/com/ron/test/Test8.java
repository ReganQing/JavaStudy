package com.ron.test;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
       //双色球
        //1.生成中奖号码
        int[] arr = createNumber();
        System.out.println("---------------------");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
        System.out.println("---------------------");
        //2.用户创建自己的号码
        int[] userArr = userNumber();
        for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i] + " ");
        }
        //3.两组号码进行比对查看是否中奖
        //统计红球和蓝球的数量
        int redCount = 0;
        int blueCount = 0;

        //判断红球号码
        for (int i = 0; i < arr.length - 1; i++) {
            int redNumber = userArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]){
                    redCount++; //若红球号码相同则加一个
                    break;  //跳出内循环
                }
            }
        }
        //判断蓝球是否相同
        int blueNumber = userArr[userArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
        System.out.println("有" + redCount + "个红球，有" + blueCount + "个蓝球");

        //根据红球和蓝球的个数来判断中了几等奖
        if (redCount == 1 && blueCount == 1) {
            System.out.println("您中了六等奖，金额5元");

        } else if (redCount == 2 && blueCount == 1) {
            System.out.println("您中了五等奖，金额10元");
        }else if (redCount == 3 && blueCount == 1) {
            System.out.println("您中了四等奖，金额200元");
        }else if (redCount == 4 && blueCount == 1) {
            System.out.println("您中了三等奖，金额3000元");
        }else if (redCount == 5 && blueCount == 1) {
            System.out.println("您中了二等奖，金额最高为500万元");
        }else if (redCount == 6 && blueCount == 1) {
            System.out.println("您中了二等奖，金额最高为1000万元");
        }else {
            System.out.println("很遗憾您未中奖");
        }
    }
    //用户输入数组方法,6个红球加1个蓝球
    public static int[] userNumber() {
        //1.创建一个数组用于添加用户购买的号码
        int[] arr = new int[7];

        //2.利用键盘录入让用户输入号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int readNumber = sc.nextInt();
            //readNumber需要在1~33中且不重复
            if (readNumber >= 1 && readNumber <= 33) {
                boolean flag = contains(arr, readNumber);
                if (!flag) {
                    //红球不重复可以添加进数组
                    arr[i] = readNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        //添加一个1~16内的蓝球
        System.out.println("请输入一个蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("蓝球号码超出范围，请重新输入");
            }
        }
    return arr;
}


    //创建中奖号码的方法
    public static int[] createNumber() {
        //6个红球1~33，1个蓝球1~16，红球注意不能重复选择
        int[] arr = new int[7];
        //随机选择6个红球要添加到数组中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取号码
            int readNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, readNumber);
            if (!flag) {
                arr[i] = readNumber;    //将红球号码添加到数组中
                i++;
            }
        }
        //生成蓝球号码并添加到数组中
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }

    //用于判断已选取数组是否已在数组中
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}

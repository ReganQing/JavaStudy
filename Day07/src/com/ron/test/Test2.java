package com.ron.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*定义方法实现随机产生一个五位的验证码
        验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字
         */
        /*
        方法：
            在以后如果我们要在一堆有什么规律的数据中随机抽取
            可以先把这些数据放到数组当中，再随机抽取一个索引
         */

        //分析
        //1.添加大小写字母到数组中，在ASCII码表中A为65，a为97,可以进行强转
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char)(97 + i);
            }else {
                //添加大写字母
                chs[i] = (char)(65 + i -26);
            }
        }
        String result = "";
        //2.随机索引选取4个字母
        //随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //利用随机索引，获取对应的元素
            //System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
        //System.out.println(result);
        //3.随机抽取一个0~9的数字
        int num = r.nextInt(10);
        //生成最终结果
        result = result + num;

        //打印最终结果
        System.out.println(result);
    }
}

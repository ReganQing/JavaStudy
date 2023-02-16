package com.ron.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        规则如下：先得到每位数，然后每位数加上5，再对10求余，最后将所有数字
                反转，得到一串新数。
         */

        //分析
        //1.新建一个数组，键盘录入4位数字
        int[] code = getCode();
        //2.根据规则对密码进行加密
        int[] secretCode = serectCode(code);
        //3.打印加密后的密码
        for (int i = 0; i < secretCode.length; i++) {
            System.out.print(secretCode[i]);
        }

    }

    //1.我要干嘛？
    //2.我需要什么？需要录入数字
    //3.需要返回值吗？需要

    //键盘录入密码
    public static int[] getCode(){
        int[] code = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < code.length; i++) {
            System.out.println("请输入有效的四位密码");
            code[i] = sc.nextInt();
        }
        return code;
    }

    //对数字进行加密
    public static int[] serectCode(int[] code){
        int[] newCode = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            code[i] = (code[i] + 5) % 10;
        }
        for (int i = newCode.length - 1,j=0; i >= 0 && j < newCode.length; i--,j++) {
            newCode[i] = code[j];

        }
        return newCode;
    }
}

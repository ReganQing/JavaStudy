package com.ron.test;



public class Test9 {
    public static void main(String[] args) {
        //一张0.1mm的纸折叠一次厚度变为原来的两倍，折叠多少次厚度与珠峰一样
        //1.定义两个变量用来记录珠峰和纸张的高度和初始厚度
        int mountain = 8844430;
        double paper = 0.1;
        //2.定义一个变量统计次数
        int count = 0;
        //3.循环折叠纸张，只要纸张厚度小于山峰高度则继续折叠
        while(paper < mountain){
            //折叠纸张
            paper = paper * 2;
            //每折叠一次，++一次
            count++;
        }
        //当循环结束之后，count记录的值就是折叠的次数
        System.out.println(count);
    }
}

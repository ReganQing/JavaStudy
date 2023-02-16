package com.ron.demo;

public class MethodDemo2 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印
        //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法

        getInfo(3.45,4.56);
    }

    //1.我要干嘛？求长方形的周长
    //2.我干这件事情，需要什么才能完成？长、宽
    public static void getInfo(double len, double wid){
        double circle = 2 * (len + wid);
        double square = len * wid;
        System.out.println("该长方形的周长为" + circle);
        System.out.println("该长方形的面积为" + square);

    }
}

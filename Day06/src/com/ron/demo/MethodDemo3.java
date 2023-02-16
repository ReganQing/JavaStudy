package com.ron.demo;

public class MethodDemo3 {
    public static void main(String[] args) {
        //掌握带返回值方法的定义和调用格式

        //直接调用
        //getSum(10,20,30);

        //赋值调用
        //int sum = getSum(10,20,30);

        //输出调用
        System.out.println(getSum(10,20,30));
    }

    public static int getSum(int num1,int num2,int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}

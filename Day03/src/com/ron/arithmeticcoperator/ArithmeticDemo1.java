package com.ron.arithmeticcoperator;

public class ArithmeticDemo1 {
    //主入口
    //结论
    //1.整数参与计算，结果只能得到整数
    //2.小数参与计算，结果有可能是不精确的，如果我们需要精确计算，就需要用到后面知识
    public static void main(String[] args) {
        //除法
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335
        //取余
        System.out.println(11 % 2);
        //应用场景
        //1.可以用取余来判断，A是否可以被B整除
        //2.可以判断A是否为偶数
        //3.斗地主发牌，三个玩家，把每一张牌编写一个序号
        //用序号 % 3 如果结果为1，就发给第一个玩家
        //如果结果为2，就发给第二个玩家
        //如果结果为3，就发给第三个玩家
    }
}

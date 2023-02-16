package com.ron.test;

public class Test2 {
    public static void main(String[] args) {
        //汽车无人驾驶根据红绿灯来判断是否行进

        //1.定义红绿灯的三个状态
        boolean isLightGreen = true;
        boolean isLightRed = false;
        boolean isLightYellow = false;

        //2.判断
        //红灯亮，就停止
        //黄灯亮，就减速
        //绿灯亮，就行驶
        if(isLightGreen){
            System.out.println("gogogo!!!");
        } else if (isLightRed) {
            System.out.println("stop!!!");

        } else if(isLightYellow){
            System.out.println("slow!!!");
        }
    }
}

package com.ron.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //兰州拉面、武汉热干面、北京炸酱面、陕西油泼面

        //1.定义变量记录我心里想吃的面
        String noodles = "武汉热干面";
        //2.与四种面进行匹配
        switch (noodles){
            case "兰州拉面":
                System.out.println("妈妈给你做兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("妈妈给你做热干面");
                break;
            case "北京炸酱面":
                System.out.println("妈妈给你做炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("妈妈给你做油泼面");
                break;
            default:
                System.out.println("自己去泡桶泡面吃吧");
                break;
        }

    }
}

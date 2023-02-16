package com.ron.test;

public class Test1 {
    public static void main(String[] args) {
        //目标：要能区分出什么时候使用带返回值的方法
        //需求：定义方法，比较两个长方形的面积
        double area1 = getArea(1.4,3.2);
        double area2 = getArea(3.3,2.4);
        if (area1 > area2) {
            System.out.println("长方形1的面积为" + area1 +"。长方形2的面积为" + area2 + "。长方形1面积较大");
        } else if (area1 == area2) {
            System.out.println("长方形1的面积为" + area1 +"。长方形2的面积为" + area2 + "。两个长方形面积相同");
        } else {
            System.out.println("长方形1的面积为" + area1 +"。长方形2的面积为" + area2 + "。长方形2面积较大");
        }

    }
    //1.我要干嘛？比较两个长方形的面积
    public static double getArea(double len,double wid){
        double area = len * wid;
        return area;
    //2.需要什么？两个长、两个宽
/*    public static void compareArea(double len1,double wid1,double len2,double wid2){
        double area1 = len1 * wid1;
        double area2 = len2 * wid2;
        if (area1 > area2) {
            System.out.println("长方形1的面积为" + area1 +"。长方形2的面积为" + area2 + "。长方形1面积较大");
        } else if (area1 == area2) {
            System.out.println("长方形1的面积为" + area1 +"。长方形2的面积为" + area2 + "。两个长方形面积相同");
        } else {
            System.out.println("长方形1的面积为" + area1 +"。长方形2的面积为" + area2 + "。长方形2面积较大");
        }*/
    }
}

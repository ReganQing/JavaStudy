package com.ron.test4;

public class Phone {
    private String brand;   //品牌
    private int price;  //价格
    private String color;   //颜色

    //构造空参
    public Phone() {

    }
    //构造全部参数
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //设置set函数及get函数

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

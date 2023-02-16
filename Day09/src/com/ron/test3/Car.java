package com.ron.test3;

public class Car {
    private String brand; //品牌
    private int price;  //价格
    private String color;   //颜色

    //构造空参

    public Car() {
    }

    //构造所有参数

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //构造Car的JavaBean

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

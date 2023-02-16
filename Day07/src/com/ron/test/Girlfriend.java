package com.ron.test;

public class Girlfriend {
    //属性
    private String name;
    private int age;
    private String gender;




    //针对于每一个私有化成员变量，都要提供get和set方法
    //set方法：给成员变量进行赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量赋值
    //name
    public void setName(String n) {
        name = n;
    }

    //age
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }

    //gender
    public void setGender(String g) {
        gender = g;
    }



    //作用：对外提供属性
    //name
    public String getName() {
        return name;
    }
    //age
    public int getAge() {
        return age;
    }
    //gender
    public String getGender() {
        return gender;
    }
    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}

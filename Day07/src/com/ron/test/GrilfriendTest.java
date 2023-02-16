package com.ron.test;

public class GrilfriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        Girlfriend gf1 = new Girlfriend();
        gf1.setName("yb");
        gf1.setAge(26);
        gf1.setGender("beauty");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}

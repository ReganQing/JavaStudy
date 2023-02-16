package com.ron.test4.test6;

public class Student {
    private String name;
    private int id;
    private int age;

    //创建空参构造
    public Student() {
    }

    //创建全部参数的造
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //创建get和set函数
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

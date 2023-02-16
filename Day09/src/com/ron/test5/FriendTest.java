package com.ron.test5;

public class FriendTest {
    public static void main(String[] args) {
        //1.构造一个数组存储对象
        Friend[] arr = new Friend[4];

        //2.创建对象
        Friend f1 = new Friend("张三", 23, "男", "爬山");
        Friend f2 = new Friend("李七七", 19, "女", "摄影");
        Friend f3 = new Friend("王二", 25, "男", "板画");
        Friend f4 = new Friend("赵玲", 21, "女", "跑步");

        //3.将对象存储到数组里
        arr[0] = f1;
        arr[1] = f2;
        arr[2] = f3;
        arr[3] = f4;

        //3.计算出4个朋友的平均年龄
        int sum = 0;
        for (Friend f : arr) {
            sum = sum + f.getAge();
        }
        int avg = sum / arr.length;

        //4.统计年龄比平均值低的朋友有几个，打印他们的消息
        int count = 0;
        for (Friend f : arr) {
            if (f.getAge() < avg) {
                count++;
                System.out.println(f.getName() + "," + f.getGender() + "," + f.getAge() + "," + f.getHobby());
            }
        }
        System.out.println(count + "个低于平均年龄值的朋友");
    }
}

package com.ron.test;

public class Test5 {
    public static void main(String[] args) {
        //提取出整数的每一位并放进数组里面
        //1.创建一个数组
        int num = 12345;
        int temp = num;
        //定义一个变量记录数字有多少位
        int count = 0;
        while(temp != 0){
            int num1 = 0;
            num1 = temp / 10;
            temp = num1;
            //System.out.println(temp);
            count++;
        }
        //System.out.println(count);
        int[] arr = new int[count];
        //2.将整数里的每个数字放入数组里
        int index = arr.length - 1;
        while (num != 0) {
            int num2 = num % 10;
            num = num /10;
            arr[index] = num2;
            index--;
        }
        //验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

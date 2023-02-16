package com.ron.test2;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001", "索尼耳机XM4", 3999.0, 99);
        Goods g2 = new Goods("002", "Iphone14 Pro Max", 7999.0, 120);
        Goods g3 = new Goods("003", "菜狗玩偶", 99.0, 20);

        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4.遍历
        for (Goods goods : arr) {
            //i 索引 arr[i] 元素
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }

    }
}

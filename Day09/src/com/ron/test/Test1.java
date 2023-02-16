package com.ron.test;

public class Test1 {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role r1 = new Role("春丽",100,'女');
        //2.创建第二个角色
        Role r2 = new Role("胖子",100,'男');

        //展示一下角色信息
        r1.showInfo();
        r2.showInfo();

        //3.开始回合制格斗
        while(true){
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }

            //r2开始攻击r1
            r2.attack(r1);
            //判断r1的剩余血量
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }

    }
}

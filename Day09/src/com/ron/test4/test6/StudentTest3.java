package com.ron.test4.test6;

public class StudentTest3 {
    public static void main(String[] args) {
        //1.创建一个数组存储对象
        Student[] arr = new Student[3];

        //2.创建对象
        Student s1 = new Student("Lily", 1, 17);
        Student s2 = new Student("Mike", 2, 18);
        Student s3 = new Student("Tom", 3, 19);

        //3.把学生对象添加到数组中
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        /*要求：查询数组id为2的学生，若存在，则将他的年龄+1岁*/

        //4.查询数组id
        int index = getIndex(arr, 2);
        if (index >= 0){
            //如果存在，则将他的年龄+1岁
            arr[index].setAge(arr[index].getAge() + 1);
            showInfo(arr);
        }else{
            //如果不存在，则提示修改失败
            System.out.println("该id对象不存在，修改失败");
        }

    }
    //定义一个方法遍历数组里的学生信息
    public static void showInfo(Student[] arr){
        for (Student s : arr) {
            if(s != null) {
                System.out.println(s.getName() + ", " + s.getId() + ", " + s.getAge());
            }
        }

    }
    //定义一个方法找到id在数组中对应的索引
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if(s != null){
                int sid = s.getId();
                if(sid == id){
                    return i;
                }
            }
        }
        //当循环结束之后还没有找到，就表示不存在
        return -1;
    }
}

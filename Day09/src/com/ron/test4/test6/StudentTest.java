package com.ron.test4.test6;

public class StudentTest {
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

        //要求1：再次添加一个学生对象，并在添加时进行学号的唯一性判断
        //4.再添加一个学生对象
        Student s4 = new Student("Gucci", 4, 20);

        //5.唯一性判断
        //5.1 已存在 --- 提示重复
        boolean flag = contains(arr, s4.getId());
        if(flag){
            System.out.println("当前数组已存在该对象");
        } else {
            //5.2 不存在 --- 添加学生对象
            //6.添加学生对象
            //6.1 老数组已存满 --- 只能创建一个新的的数组，新数组的长度 = 老数组 + 1
            //6.2 老数组未存满 --- 直接添加
            int count = getCount(arr);
            if(count == arr.length) {
                //已经存满
                Student[] newArr = createNewArr(arr);
                //把s4添加进去
                newArr[count] = s4;
                //要求2：添加完毕之后遍历所有学生信息
                showInfo(newArr);

            } else {
                //没有存满则直接添加
                arr[count] = s4;
                showInfo(arr);
            }
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
    //定义一个方法将老数组里的对象复制到新数组中
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //把老数组中的元素添加到新数组中
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //定义一个方法来判断数组里面是否已包含当前id对象
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取数组里面的每一个学生对象
            Student stu = arr[i];
            //获取数组中学生对象的id，并与添加的学生对象进行比较
            int sid = stu.getId();
            if(sid == id){
                return true;
            }
        }
        //当循环结束之后，还没有重复id
        return false;
    }
    //定义一个方法判断当前数组已经存了几个元素
    public static int getCount(Student[] arr){
        //定义一个计数器用来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}

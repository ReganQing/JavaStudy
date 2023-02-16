package Day2;
//1.导包
import java.util.Scanner;

public class ScannerDemo1 {
    //主入口
    public static void main(String[] args){
        //2.创建对象，表示我现在准备要用Scanner这个类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");

        //3.接收数据
        int i = sc.nextInt();

        System.out.println(i);
    }
}

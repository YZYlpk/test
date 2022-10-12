package array;
//new出来的对象都是存放在堆中
//数组定义
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //声明数组类型，并赋予内存容量
        int [] nums=new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入十个数字：");
        for (int i = 0; i < nums.length; i++) {
            if(scanner.hasNextInt()){
                nums[i] = scanner.nextInt();
            }
        }
        System.out.println("打印出数组的元素：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
        System.out.println("============================================");
        //通过方法打印元素
        System.out.println("打印出数组的元素：");
        printfArray(nums);
    }


    //声明方法，打印功能
    public static void printfArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}

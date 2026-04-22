package Digitextraction;

import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {
        //键盘输入一个数字，判断这个数字是否在1~10之间
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number1 = scanner.nextInt();
        boolean result1 = number1 >= 1 && number1 <= 10;
        System.out.println(result1);

        //键盘输入一个数字，判断这个数字是否不在1~10之间
        System.out.println("请输入一个数字：");
        int number2 = scanner.nextInt();
        boolean result2 = number2 < 1 || number2 > 10;
        System.out.println(result2);
    }
}

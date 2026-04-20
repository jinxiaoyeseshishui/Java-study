package Digitextraction;

import java.util.Scanner;

public class digitExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = scanner.nextInt();
        System.out.println("整数的个位是：" + number % 10);
        System.out.println("整数的十位是：" + number / 10 % 10);
        System.out.println("整数的百位是：" + number / 100 % 10);
    }
}

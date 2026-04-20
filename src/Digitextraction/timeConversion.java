package Digitextraction;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        System.out.println("请输入一个秒数：");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
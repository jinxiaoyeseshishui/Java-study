package Digitextraction;

import java.util.Scanner;

public class shortcircuitlogicalOperator {
    public static void main(String[] args) {
        //键盘录入一个四位整数数字，判断这个数字是否为回文数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位整数数字：");
        int number = scanner.nextInt();
        boolean result = (number / 1000 == number % 10) && (number / 100 % 10 == number / 10 % 10);
        System.out.println(result);

        //键盘录入一个数字，定义一个两位数，只要包含7或者7的倍数，就是7的有缘数
        System.out.println("请输入一个数字：");
        int number2 = scanner.nextInt();
        boolean result2 = number2 % 7 == 0 || number2 % 10 == 7 || number2 / 10 == 7;
        System.out.println(result2);
    }
}

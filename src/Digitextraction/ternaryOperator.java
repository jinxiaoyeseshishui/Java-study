package Digitextraction;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a > b ? a : b;
        //int c = MATH.max(a,b);
        System.out.println(c);
    }

}

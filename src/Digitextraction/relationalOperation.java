package Digitextraction;

import java.util.Scanner;

public class relationalOperation {
    public static void main(String[] args) {
        /*
        1.键盘输入我和和朋友的身高比比谁高
        2.键盘输入一个数字，判断这个数字是否能被3整除
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入我的身高：");
        double myHeight = scanner.nextDouble();
        System.out.println("请输入朋友身高：");
        double friendHeight = scanner.nextDouble();
        boolean result = myHeight >= friendHeight;
        System.out.println(result);

        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        boolean result2 = number % 3 == 0;
        System.out.println(result2);
    }
}

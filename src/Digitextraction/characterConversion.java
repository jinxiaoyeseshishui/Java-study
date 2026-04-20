package Digitextraction;

import java.util.Scanner;

public class characterConversion {
    public static void main(String[] args) {
        //实现字母的大小写转换，将大写的字母转换成小写，小写字母转换成大写
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符：");

        char ch1 = scanner.next().charAt(0);

        if (ch1 >= 'A' && ch1 <= 'Z')
            System.out.println((char)(ch1 + 32));
        else if (ch1 >= 'a' && ch1 <= 'z')
            System.out.println((char)(ch1 - 32));
    }

}

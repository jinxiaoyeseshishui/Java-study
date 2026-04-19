package KeyboardInput;

import java.util.Scanner;

public class keyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接收键盘录入的整数
        int num = sc.nextInt();
        System.out.println(num);
        //接收键盘录用的小数
        double num2 = sc.nextDouble();
        System.out.println(num2);
        //接收键盘录入的字符串
        String str = sc.next();
        System.out.println(str);
    }
}

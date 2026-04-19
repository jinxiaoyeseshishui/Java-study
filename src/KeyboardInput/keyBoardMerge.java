package KeyboardInput;

import java.util.Scanner;

public class keyBoardMerge {
        /**
     * 主方法：从键盘读取两个整数并计算它们的和
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字：");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个数字：");
        int num2 = scanner.nextInt();

        // 计算两数之和并输出结果
        int sum = num1 + num2;
        System.out.println("两个数字的和为：" + sum);
    }

}

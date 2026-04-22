package Judge;

import java.util.Scanner;

public class ifJudge {
    public static void main(String[] args) {
        //定义一个变量表示人的温度，当温度超过38度，就打印语音警告
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入温度：");
        int temperture = scanner.nextInt();
        if (temperture > 38){
            System.out.println("温度警告");
        }
        else {
            System.out.println("温度正常");
        }
    }
}

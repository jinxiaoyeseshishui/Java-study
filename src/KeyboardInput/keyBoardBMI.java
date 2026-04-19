package KeyboardInput;

import java.util.Scanner;

public class keyBoardBMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的体重：");
        double weight = scanner.nextDouble();

        System.out.println("请输入你的身高：");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI:" + bmi);
        if (bmi < 18.5){
            System.out.println("身体状态消瘦，健康风险部分增加");
        } else if (bmi < 23.9) {
            System.out.println("身体状态正常，健康风险正常");
        }else if (bmi < 26.9) {
            System.out.println("身体状态偏胖，健康风险增加");
        }else if(bmi < 29.9){
            System.out.println("身体状态肥胖，健康风险增加");
        }else {
            System.out.println("身体状态严重肥胖，健康风险严重增加");
        }
    }

}

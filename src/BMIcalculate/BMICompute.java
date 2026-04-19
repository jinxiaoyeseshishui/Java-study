package BMIcalculate;

public class BMICompute {
    public static void main(String[] args) {
        double weight = 80;
        double height = 1.7;
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
        //计算出你当前身高，在标准BMI情况下，体重最多是多少
        System.out.println("在标准BMI情况下，你的体重最多为：" + (height * height * 23.9) + "kg");
    }
}

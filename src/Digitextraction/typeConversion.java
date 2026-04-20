package Digitextraction;

public class typeConversion {
    public static void main(String[] args) {
        byte b= 100;
        short s = 200;
        double d = 20.3;
        //byte类型和short类型进行运算，结果会自动转换成int类型,运算结果会自动转换成double类型
        double result = b + s + d;
        System.out.println(result);

        short s1 = 100;
        short s2 = 200;

        //byte类型不能进行运算，需要转换成int类型,运算结果会自动转换成byte类型，运算结果可能超出byte范围
        byte result1 = (byte) (s1 + s2);
        System.out.println(result1);
        //byte类型不能进行运算，需要转换成int类型,运算结果会自动转换成int类型
        int result2 = s1 + s2;
        System.out.println(result2);
    }
}

package balance.practice;

public class Practice2 {
    public static void main(String[] args) {
        int wechatBalance = 0;
        int alipayBalance = 10;
        int bankBalance = 20;
        wechatBalance =wechatBalance + 10 - 2;
        int totalBalance = wechatBalance + alipayBalance + bankBalance;
        System.out.println(totalBalance);
    }

}

package StreetFightergamepractice;

public class Practice {
    public static void main(String[] args) {
        // 我方
        String player = "叉子";
        // 我方攻击力
        double player_attack = 220;
        // 我方防御力
        double player_defense = 85;
        // 我方血量
        double player_health = 1012.5;
        // 我方技能攻击力加成
        double player_skill_bonus = 1.2;
        // 敌方
        String opponent = "长手";
        // 敌方攻击力
        double opponent_attack = 210;
        // 敌方防御力
        double opponent_defense = 80;
        // 敌方血量
        double opponent_health = 1223.3;
        // 敌方技能攻击力加成
        double opponent_skill_bonus = 1.3;
        //我方技能伤害
        double player_skill_damage = player_attack*player_skill_bonus-opponent_defense;
        //我方普攻伤害
        double player_basic_attack_damage = player_attack - opponent_defense;
        //敌方技能伤害
        double opponent_skill_damage = opponent_attack*opponent_skill_bonus-player_defense;
        //敌方普攻伤害
        double opponent_basic_attack_damage = opponent_attack - player_defense;

        //第一次普攻攻击敌方剩余血量
        double remainingHealthAfterFirstAttack = opponent_health - player_basic_attack_damage;
        //第二次技能攻击敌方剩余血量
        double second_attack_damage_health = remainingHealthAfterFirstAttack - player_skill_damage;
        //输出
        System.out.println("我方技能伤害：" +player_skill_damage + ",我方普攻伤害：" + player_basic_attack_damage + ".");
        System.out.println("敌方技能伤害：" +opponent_skill_damage + ",敌方普攻伤害：" + opponent_basic_attack_damage + ".");
        System.out.println("敌方第一次受到普攻伤害剩余血量：" + remainingHealthAfterFirstAttack  + ",敌方第二次受到技能伤害剩余血量：" + second_attack_damage_health);
    }
}

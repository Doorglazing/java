package DouDiZhu;

import java.util.*;

/**
 *  斗地主 的洗牌和发牌动作
 *      规则： 使用54张牌打乱顺序，三个玩家参与游戏没人17张 最后剩3张底牌
 *      - 准备牌 : 每张牌包括花色和数字
 *      - 发牌  ：
 *      - 看牌
 *
 */
public class Poker {
    public static void main(String[] args) {
        //准备牌
        List<String> pokerBox = new ArrayList<>();
        //花色
        List<String> color = new ArrayList<>();
        //数字
        List<String> numbers = new ArrayList<>();
//        HashMap<String, String> wtf = new HashMap<>();
        color.add("♥");
        color.add("♦");
        color.add("♠");
        color.add("♣");
        for (int i = 2; i <= 10 ; i++) {
            numbers.add(""+i);
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        // 生产牌
       for(String i : color){
           for(String j : numbers){
               pokerBox.add(i + j);
//               wtf.put(i+j, j);
           }
       }
//       System.out.println(wtf);
//       System.out.println(wtf.values());
       pokerBox.add("大王");
       pokerBox.add("小王");
       // 洗牌 : Collections 工具类 都是静态方法
        // shuffle(List list) 使用默认随机元对指定列表进行置换
       Collections.shuffle(pokerBox);
       //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
//        ArrayList<String> player4 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        int len = pokerBox.size();
        String card;
        for (int i = 0; i < len; i++) {
            card = pokerBox.get(i);
            if(i >= 51){
                dipai.add(card);
                continue;
            }
            if(i % 3 == 0){
                player1.add(card);
                continue;
            }
            if(i % 3 == 1){
                player2.add(card);
                continue;
            }
            if(i % 3 ==2){
                player3.add(card);
                continue;
            }
        }

        // look look
        System.out.println("player1" + player1);
        System.out.println("player2" + player2);
        System.out.println("player3" + player3);
        System.out.println("dipai" + dipai);

    }
}

package RedBack;

import java.util.ArrayList;
import java.util.Random;

public class User extends Manager {
    ArrayList<String> userNames = new ArrayList<>();
    ArrayList<Integer> money = new ArrayList<>();
    Random random = new Random();

    void userSet () {
        super.faRed();
//        System.out.println(num);
        int ranMoney = 0;
        for (int i = 0; i < num; i++) {
            userNames.add("用户成员" + (char)(65 + i));
            money.add(random.nextInt(50));
            System.out.println(money.get(i));
        }
        int ra =  random.nextInt(userNames.size());
        for (int i = 0; i < num; i++) {
            int sFA = fa / 3;
            int mod = fa % 3;
//            System.out.println(fa);
            if(i == ra){
                System.out.println(userNames.get(i)+(money.get(i)+ sFA + mod)+"元");
            }else{
                System.out.println(userNames.get(i)+(money.get(i)+ sFA)+ "元");
            }
        }

    }
    void showMsg(){
        for (int i = 0; i < num; i++) {
            System.out.println(userNames.get(i)+money.get(i)+"元");
        }
    }
}

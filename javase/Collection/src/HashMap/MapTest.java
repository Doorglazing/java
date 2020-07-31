package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一串字符串");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(num(str));

    }
    public static HashMap<Character, Integer> num(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int len = str.length();
        //str.fori 快捷键
        for(int i = 0; i < len; i++){
            if(map.get(str.charAt(i)) == null){
                map.put(str.charAt(i), 1);
            }else{
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
        }
        return map;
    }
}

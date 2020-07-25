package Demo1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串数据");
        String s = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }else if(ch >= 'a'&& ch <= 'z'){
                smallCount++;
            }else if(ch >= '0' && ch <= '9'){

            }else{
                continue;
            }
        }
        System.out.println("大写字符数" + bigCount);
        System.out.println("小写字符数" + smallCount);
        System.out.println("数字" + numberCount);
    }
}

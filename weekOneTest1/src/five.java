import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("输入年月日");
        int year = a.nextInt();
        int month = a.nextInt();
        int day = a.nextInt();
        int add = day;

        for(int i = 1; i < month; i++){
            if(i == 2){
                add += 28;
                continue;
            }
            if(month % 2 == 0){
                add += 30;
                continue;
            }
            add += 31;
            System.out.println(add);
        }
        if((year%4 == 0 && year % 100 != 0) || year % 400 == 0){
            add += 1;
        }
        System.out.println(add);
    }
}

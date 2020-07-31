package homework.two;

public class addNum {
    public static void main(String[] args) {
        System.out.println(add(4));
    }

    public static double add(int n){
        int num = 2;
        int num1 = 3;
        int num2 = 1;
        int reser;
        double add1 = 0;
        if(n == 1){
            return 2;
        }
        if(n == 2){
            return 3.5;
        }
        for(int i = 3; i <= n; i++){
            add1 +=(double) (num+num1)/(num2+num);
            reser = num1;
            num1 = num + num1;
            num2 = num;
            num = reser;
        }
        add1 += 3.5;
        return add1;
    }
}

package PalouTi;

public class Palouti {
    public static void main(String[] args) {
        System.out.println(Palouti(4));
    }


    public static int Palouti (int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return Palouti(n-1) + Palouti(n - 2);
    }
}

package Lambda;

public class LambdaCa {
    public static void main(String[] args) {
        calcCacu(5,6,(int a, int b)->{
            return a+b;
        });
        calcCacu(5,6,(a,b)->a + b);

    }
    public static void calcCacu(int a, int b, Caculator caculator){
        System.out.println(caculator.calc(a,b));
    }
}

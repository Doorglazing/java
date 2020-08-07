package MathStack.DiGui;

public class Add {
    public static void main(String[] args) {
        System.out.println(addMath(5));
    }
    public static int addMath(int num){
        if(num == 1){
            return 1;
        }
        return num + addMath(-- num);
    }
}

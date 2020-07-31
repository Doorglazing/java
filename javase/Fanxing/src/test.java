import java.util.Calendar;

public class test {
    static int i = 10;
    int j = 0;
    public static void main(String[] args) {
        Calendar.getInstance();
    }
    int num(int i){
        if(i == 1){
            return 1;
        }
        return i + num(-- i);
        // i + num(i - 1);
        // i + i- 1+ num（i - 2）
    }

}

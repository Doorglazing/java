package game;

public class Digui {
    int diGui(int n){
        if(n == 1){
            return 1;
        }
        return n + diGui(--n);
    }
}

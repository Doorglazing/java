package System;

public class SystemTest {
    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        for(int i = 0; i < 9999; i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println(System.currentTimeMillis()-first);
    }
}

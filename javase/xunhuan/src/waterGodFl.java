public class waterGodFl {
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++){
            int ge = i % 10;
            int ten = i / 10 % 10;
            int hun = i /100;
            if(ge*ge*ge + ten*ten*ten + hun*hun*hun == i){
                System.out.println(i);
            }
        }
    }
}

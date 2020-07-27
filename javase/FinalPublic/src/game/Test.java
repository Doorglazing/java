package game;

public class Test {
    public static void main(String[] args) {
        new Armour().attact(new A(){
            public void fbs(){
                int a = 1231;
                System.out.println("aaa" + 1231);
            }
        });
        System.out.println( new Digui().diGui(5));
    }
}

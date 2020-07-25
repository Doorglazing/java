package homework2;

public class B implements A{
    public void showA(){
        System.out.println("AAAA");
    }

    public static void main(String[] args) {
        B b = new B();
        b.showA();
//        b.showB10("b");
//        b.showC10("c");
    }

}

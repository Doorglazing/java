public class Base {
    Base(){
        System.out.print("Base");
    }
    public static void main(String[] args) {
        new Alpha();
        new Base();
    }
}
class Alpha extends Base{}

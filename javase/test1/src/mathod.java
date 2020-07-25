public class mathod {
    String name;
    double price;
    mathod(String _name){
        this.name = _name;
    }
    mathod(String _name, double _price){
        this.name = _name;
        this.price = _price;
    }
    mathod(){
        this("java", 33);
    }

    public static void main(String[] args) {
        mathod a = new mathod();
        System.out.println(a.name + a.price);
        System.out.println((char)(56));
    }
}

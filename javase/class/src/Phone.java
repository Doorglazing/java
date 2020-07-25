public class Phone {
    String brand;

    String color;
    private int price;
    private int age = 35;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void callPhone(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }

    public void sendMessage(int i){
        System.out.println(i);
    }

}

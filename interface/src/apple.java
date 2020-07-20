public class apple extends Fruit implements Eatable {
    public void eat(){
        super.infor("苹果");
    }
}

abstract class Fruit{
    String color;
    void infor(String color){
        this.color = color;
        System.out.println(color);
    }
}

interface Eatable{
   public void eat();
}

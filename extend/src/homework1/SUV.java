package homework1;

public class SUV extends Auto {
    private double smallCar = 4295,
                   midCar = 5070;


    public SUV(){

    }
    public SUV(String brand, double carLength, double price) {
        super(brand, carLength, price);
    }

    void judge(){
        double carL = super.getCarLength();
        System.out.println("车型：" + (carL > smallCar ? (carL > midCar ? "大型SUV": "中型SUV") : "小型SUV" ));
        System.out.println("    "+"价格：" + super.getPrice());
        System.out.println("    "+"车长：" + carL);
    }
}

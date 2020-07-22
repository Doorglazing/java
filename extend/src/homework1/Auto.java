package homework1;

public class Auto {
    private String brand;
    private double carLength;
    private double price;
    public Auto(){}
    public Auto(String brand, double carLength, double price) {
        this.brand = brand;
        this.carLength = carLength;
        this.price = price;
    }

    public double getCarLength() {
        return carLength;
    }

    public double getPrice() {
        return price;
    }
}

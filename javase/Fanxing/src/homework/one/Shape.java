package homework.one;

public abstract class Shape {
    private int area;
    private int per;
    private String color;
    public Shape(){}
    public Shape(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public abstract void getArea();
    public abstract void getPer();
    public abstract void showAll();
}

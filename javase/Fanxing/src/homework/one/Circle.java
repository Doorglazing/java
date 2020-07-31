package homework.one;

public class Circle extends Shape {
    private double radius;
    Circle(){}

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("面积为："+ radius*radius*Math.PI);
    }

    @Override
    public void getPer() {
        System.out.println("周长为："+ 2*Math.PI*radius);
    }

    @Override
    public void showAll() {
        System.out.println("半径为:"+radius+"颜色为:"+ super.getColor()+"的○");

    }
}

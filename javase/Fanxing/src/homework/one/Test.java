package homework.one;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle("blue",1,2),new Circle("red",1.2)};
        for(Shape shape : shapes){
            shape.getArea();
            shape.getPer();
            shape.showAll();
        }
    }
}

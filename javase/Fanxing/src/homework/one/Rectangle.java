package homework.one;

public class Rectangle extends Shape {
    private int width;
    private int height;
    Rectangle(){}

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("面积为："+ width*height);
    }

    @Override
    public void getPer() {
        System.out.println("周长为："+ (width+height)*2);
    }

    @Override
    public void showAll() {
        System.out.println("长度为:"+width+","+"宽度为："+height+"颜色为:"+ super.getColor()+"矩形");
    }
}

public class Circle {
    private double r;
    Circle(){

    }
    Circle(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    void showArea(){
        System.out.println("半径为："+ r +",面积为：" +String.format("%.2f", Math.PI * r * r )  );
    }
    void showPerimeter(){
        System.out.println("半径为："+ r +",面积为：" + String.format("%.2f", 2 * Math.PI * r));
        //String.format() 可以用作保留几位小数
    }
}

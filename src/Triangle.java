public class Triangle implements Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return base + side1 + side2;
    }
}

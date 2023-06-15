public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(10, 5, 10, 10);

        System.out.println("Circle");
        System.out.println("Area: " +circle.getArea());
        System.out.println("Perimeter: " +circle.getPerimeter());

        System.out.println("\nRectangle");
        System.out.println("Area: " +rectangle.getArea());
        System.out.println("Perimeter: " +rectangle.getPerimeter());

        System.out.println("\nTriangle");
        System.out.println("Area: " +triangle.getArea());
        System.out.println("Perimeter: " +triangle.getPerimeter());
    }
}
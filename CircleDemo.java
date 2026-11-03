class Circle {
    double radius;
    Circle(double radius) { this.radius = radius; }
    double calculateArea() { return Math.PI * radius * radius; }
    double calculateCircumference() { return 2 * Math.PI * radius; }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.printf("Area = %.2f%n", c.calculateArea());
        System.out.printf("Circumference = %.2f%n",
                          c.calculateCircumference());
    }
}

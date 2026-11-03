class Shape {
    double area() { return 0; }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    @Override double area() { return Math.PI * radius * radius; }
}

class RectangleShape extends Shape {
    double length, width;
    RectangleShape(double l, double w) { length = l; width = w; }
    @Override double area() { return length * width; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    @Override double area() { return 0.5 * base * height; }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3), new RectangleShape(4, 5), new Triangle(6, 4)
        };
        for (Shape s : shapes)
            System.out.printf("%s area = %.2f%n",
                    s.getClass().getSimpleName(), s.area());
    }
}

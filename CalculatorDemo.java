class Calculator {
    int calculate(int a, int b) { return a + b; }
    double calculate(double a, double b) { return a * b; }
    int calculate(int a, int b, int c) { return Math.max(a, Math.max(b, c)); }
    double calculate(int a, double b) { return a - b; }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculate(10, 20));
        System.out.println(c.calculate(2.5, 4.0));
        System.out.println(c.calculate(10, 30, 20));
        System.out.println(c.calculate(10, 2.5));
    }
}

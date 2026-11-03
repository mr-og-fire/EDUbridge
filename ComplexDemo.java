class Complex {
    double real, imaginary;
    Complex(double r, double i) { real = r; imaginary = i; }
    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }
    Complex multiply(Complex c) {
        return new Complex(real*c.real - imaginary*c.imaginary,
                           real*c.imaginary + imaginary*c.real);
    }
    int compareMagnitude(Complex c) {
        return Double.compare(Math.hypot(real, imaginary),
                              Math.hypot(c.real, c.imaginary));
    }
    Complex copy() { return new Complex(real, imaginary); }
    void display() {
        System.out.println(real + (imaginary < 0 ? " - " : " + ")
                           + Math.abs(imaginary) + "i");
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex a = new Complex(3, 2), b = new Complex(1, 4);
        a.add(b).display();
        a.multiply(b).display();
        System.out.println("Magnitude comparison: " + a.compareMagnitude(b));
        Complex copied = a.copy();
        a.real = 100;
        System.out.print("Changed original: "); a.display();
        System.out.print("Copy: "); copied.display();
    }
}

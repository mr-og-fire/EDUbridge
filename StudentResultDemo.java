class StudentResult {
    private String usn, name;
    private double m1, m2, m3;
    static int studentCount = 0;
    final double MAX_MARKS = 100.0;
    StudentResult(String usn, String name, double a, double b, double c) {
        this.usn = usn; this.name = name;
        setMarks(a, b, c);
        studentCount++;
    }
    private boolean valid(double m) { return m >= 0 && m <= MAX_MARKS; }
    void setMarks(double a, double b, double c) {
        if (!valid(a) || !valid(b) || !valid(c))
            throw new IllegalArgumentException("Marks must be 0 to 100");
        m1 = a; m2 = b; m3 = c;
    }
    String getUsn() { return usn; }
    String getName() { return name; }
    double getM1() { return m1; }
    double getM2() { return m2; }
    double getM3() { return m3; }
    double total() { return m1 + m2 + m3; }
    double average() { return total() / 3; }
    void display() { System.out.println(usn + " | " + name); }
    void display(boolean result) {
        display();
        if (result) System.out.println("Total: " + total()
                + ", Average: " + average());
    }
    ResultSummary getSummary() {
        return new ResultSummary(name, total(), average());
    }
}

class ResultSummary {
    String name; double total, average;
    ResultSummary(String n, double t, double a) {
        name = n; total = t; average = a;
    }
    void display() {
        System.out.println(name + " | " + total + " | " + average);
    }
}

public class StudentResultDemo {
    public static void main(String[] args) {
        StudentResult s = new StudentResult("1CI23CS001", "Anu", 85, 90, 88);
        s.display();
        s.display(true);
        s.getSummary().display();
        System.out.println("Students: " + StudentResult.studentCount);
    }
}

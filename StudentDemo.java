class Student {
    String name;
    int rollNo;
    double marks;
    void display() {
        System.out.println(name + " | " + rollNo + " | " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Asha"; s1.rollNo = 101; s1.marks = 85.5;
        Student s2 = new Student();
        s2.name = "Rahul"; s2.rollNo = 102; s2.marks = 91.0;
        s1.display();
        s2.display();
    }
}

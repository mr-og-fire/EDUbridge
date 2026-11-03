class Person {
    private String name;
    private int age;
    static int peopleCount = 0;
    static final String COLLEGE_NAME = "ABC Engineering College";
    Person(String name, int age) {
        this.name = name; this.age = age; peopleCount++;
    }
    String getName() { return name; }
    int getAge() { return age; }
    void displayDetails() {
        System.out.println(name + ", Age: " + age);
    }
    void displayDetails(boolean showCollege) {
        displayDetails();
        if (showCollege) System.out.println("College: " + COLLEGE_NAME);
    }
    static class Department {
        String departmentName;
        Department(String name) { departmentName = name; }
        void display() { System.out.println("Department: " + departmentName); }
    }
}

class StudentPerson extends Person {
    String usn, course;
    StudentPerson(String n, int a, String usn, String course) {
        super(n, a); this.usn = usn; this.course = course;
    }
    @Override void displayDetails() {
        System.out.println("Student: " + getName() + ", " + getAge()
                + ", USN: " + usn + ", Course: " + course);
    }
}

class Faculty extends Person {
    String facultyId, subject;
    Faculty(String n, int a, String id, String subject) {
        super(n, a); facultyId = id; this.subject = subject;
    }
    @Override void displayDetails() {
        System.out.println("Faculty: " + getName() + ", " + getAge()
                + ", ID: " + facultyId + ", Subject: " + subject);
    }
}

class Administrator extends Person {
    String role;
    Administrator(String n, int a, String role) {
        super(n, a); this.role = role;
    }
    @Override void displayDetails() {
        System.out.println("Administrator: " + getName()
                + ", " + getAge() + ", Role: " + role);
    }
}

public class CollegeManagementDemo {
    public static void main(String[] args) {
        Person[] people = {
            new StudentPerson("Anu", 20, "1CI23CS001", "CSE"),
            new Faculty("Meera", 40, "F101", "Java"),
            new Administrator("Ramesh", 45, "Office Manager")
        };
        for (Person p : people) p.displayDetails();
        people[0].displayDetails(true);
        Person.Department d = new Person.Department("Computer Science");
        d.display();
        System.out.println("Total people: " + Person.peopleCount);
    }
}

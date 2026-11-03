class Person {
    String name; int age;
    Person(String name, int age) {
        this.name = name; this.age = age;
        System.out.println("Person constructor");
    }
    void display() { System.out.println(name + ", " + age); }
}

class Employee extends Person {
    int employeeId; double basicSalary;
    Employee(String n, int a, int id, double salary) {
        super(n, a);
        employeeId = id; basicSalary = salary;
        System.out.println("Employee constructor");
    }
    @Override void display() {
        super.display(); System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department; double bonus;
    Manager(String n, int a, int id, double salary, String dept, double bonus) {
        super(n, a, id, salary);
        department = dept; this.bonus = bonus;
        System.out.println("Manager constructor");
    }
    double totalSalary() { return basicSalary + bonus; }
    @Override void display() {
        super.display();
        System.out.println(department + " | Total salary: " + totalSalary());
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Kiran", 35, 501, 60000, "IT", 10000);
        m.display();
    }
}

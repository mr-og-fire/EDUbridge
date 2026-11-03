class Employee {
    int employeeId;
    String name;
    double basicSalary;
    Employee(int id, String name, double basic) {
        employeeId = id; this.name = name; basicSalary = basic;
    }
    double calculateSalary() { return basicSalary; }
    void display() {
        System.out.println(employeeId + " | " + name
                           + " | Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    double allowance, bonus;
    PermanentEmployee(int id, String name, double basic,
                      double allowance, double bonus) {
        super(id, name, basic);
        this.allowance = allowance; this.bonus = bonus;
    }
    @Override double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    int hoursWorked; double hourlyRate;
    ContractEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        hoursWorked = hours; hourlyRate = rate;
    }
    @Override double calculateSalary() { return hoursWorked * hourlyRate; }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] staff = {
            new PermanentEmployee(1, "Asha", 30000, 5000, 3000),
            new ContractEmployee(2, "Ravi", 160, 250)
        };
        for (Employee e : staff) e.display();
    }
}

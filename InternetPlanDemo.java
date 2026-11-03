class InternetPlan {
    String planName;
    int validityDays, dataLimitGB;
    double price;
    InternetPlan() { this("Basic", 28, 299, 2); }
    InternetPlan(String name, int days, double price) {
        this(name, days, price, 1);
    }
    InternetPlan(String name, int days, double price, int dataGB) {
        this.planName = name;
        this.validityDays = days;
        this.price = price;
        this.dataLimitGB = dataGB;
    }
    void display() {
        System.out.println(planName + " | " + validityDays + " days | Rs."
                + price + " | " + dataLimitGB + " GB/day");
    }
}

public class InternetPlanDemo {
    public static void main(String[] args) {
        new InternetPlan().display();
        new InternetPlan("Standard", 56, 599).display();
        new InternetPlan("Premium", 84, 999, 3).display();
    }
}

class BankAccount {
    String account_holder_name;
    double balance;
    BankAccount(String name, double openingBalance) {
        account_holder_name = name;
        balance = openingBalance;
    }
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit");
    }
    void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal");
        else if (amount > balance) System.out.println("Insufficient balance");
        else balance -= amount;
    }
    void checkBalance() {
        System.out.println(account_holder_name + "'s balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Arun", 5000);
        a.deposit(1500);
        a.withdraw(2000);
        a.checkBalance();
    }
}

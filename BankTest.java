class SecureBankAccount {
    private String accountNumber;
    private double balance;
    static int accountCount = 0;
    final String accountId;
    SecureBankAccount(String number, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Invalid balance");
        accountNumber = number; balance = openingBalance;
        accountCount++;
        accountId = "ACC-" + accountCount;
    }
    public void deposit(double amount) {
        if (amount <= 0) System.out.println("Invalid deposit");
        else balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal");
        else if (amount > balance) System.out.println("Insufficient balance");
        else balance -= amount;
    }
    public double getBalance() { return balance; }
}

public class BankTest {
    public static void main(String[] args) {
        SecureBankAccount a = new SecureBankAccount("123456", 5000);
        a.deposit(1000); a.withdraw(1500);
        System.out.println("Balance: " + a.getBalance());
        System.out.println("Accounts: " + SecureBankAccount.accountCount);
    }
}

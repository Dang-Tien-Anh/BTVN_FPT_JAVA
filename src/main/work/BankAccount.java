package main.work;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Nạp tiền
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    // Rút tiền (mặc định trừ thẳng)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    // In số dư
    public void printBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}

package main.work;

public class VipAccount extends BankAccount {

    public VipAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double bonus = amount * 0.01; // thưởng 1%
        balance += amount + bonus;
        System.out.println("Deposit: " + amount + " (Bonus: " + bonus + ")");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; // không phí
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

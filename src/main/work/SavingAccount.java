package main.work;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double fee = amount * 0.02; // phí 2%
        double total = amount + fee;
        if (balance >= total) {
            balance -= total;
            System.out.println("Withdraw: " + amount + " (Fee: " + fee + ")");
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

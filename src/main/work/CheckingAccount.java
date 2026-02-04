package main.work;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -5000000) { // cho phép âm tối đa 5 triệu
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

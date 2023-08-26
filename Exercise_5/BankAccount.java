public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;
    public static final double OVERDRAFT_FEE = 20.95;

    public BankAccount() {
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            balance = balance - OVERDRAFT_FEE;
        }
        else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
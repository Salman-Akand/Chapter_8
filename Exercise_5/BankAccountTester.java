public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount mayuresh = new BankAccount(5000);
        BankAccount payal = new BankAccount();

        mayuresh.deposit(400);
        mayuresh.withdraw(1200);

        System.out.println("Mayuresh Patel:");
        System.out.println("Account No: " + mayuresh.getAccountNumber());
        System.out.println("Balance: " + mayuresh.getBalance());

        payal.deposit(6000);
        payal.withdraw(400);

        System.out.println("Payal Patel:");
        System.out.println("Account No: " + payal.getAccountNumber());
        System.out.println("Balance: " + payal.getBalance());
    }
}

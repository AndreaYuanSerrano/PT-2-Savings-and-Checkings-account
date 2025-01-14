public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountName, String accountHolderName, double initialBalance, double interestRate) {
        super(accountName, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate;
        balance += amount + interest;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

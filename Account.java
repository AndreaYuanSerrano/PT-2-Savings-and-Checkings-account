public abstract class Account {
  
  protected String accountNumber;
  protected String accountHolderName;
  protected double balance;
  
  public Account(String accountNumber, String accountHolderName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = initialBalance;
  }
  
  public abstract void deposit(double amount);
  public abstract void withdraw(double amount);
  
  public void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Balance: $" + balance);
  }
	public double getBalance() {
        return balance;
  }
}






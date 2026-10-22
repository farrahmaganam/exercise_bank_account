package BankAccount;


//Represents a bank account with deposit, withdrawal, and freeze operations.

public class BankAccount {
  
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }
    public void deposit(double amount) { 
        if (isFrozen) {
            System.out.println("Account is FROZEN. Unable to transact.");
            return;
        }
        System.out.printf("Amount deposited: %.2f%n", amount);
        if (amount > 0) {
            balance += amount;
            System.out.printf("Current balance: %.2f%n",balance);
        } else if (amount < 0 || amount == 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
        }
    }
    public void withdraw(double amount) {
        if (isFrozen) {
          System.out.println("Account is FROZEN. Unable to transact.");
          return;
        } 
        System.out.printf("Amount withdrawn: %.2f%n", amount);
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.printf("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }
        System.out.printf("Current balance: %.2f%n", balance);
        
    }
    public double getBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
        return balance;
    }
    public void freezeAccount() {
        isFrozen = true;
        System.out.println("Account is now FROZEN.");
    }
    public void unfreezeAccount() {
        isFrozen = false;
        System.out.println("Account is now UNFROZEN.");
    }


}

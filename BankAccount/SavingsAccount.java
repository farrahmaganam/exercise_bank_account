package BankAccount;

public class SavingsAccount extends BankAccount {
  
  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
  }

  private String ownerName;

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  
}

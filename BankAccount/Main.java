package BankAccount;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BankAccount acc1 = new SavingsAccount("Test1");
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a command (deposit, withdraw, balance, freeze, unfreeze, exit):");
      String command = scanner.nextLine();

      switch (command.toLowerCase()) {
        case "deposit":
          System.out.println("Enter amount to deposit:");
          double depositAmount = scanner.nextDouble();
          scanner.nextLine(); 
          acc1.deposit(depositAmount);
          break;
        case "withdraw":
          System.out.println("Enter amount to withdraw:");
          double withdrawAmount = scanner.nextDouble();
          scanner.nextLine();
          acc1.withdraw(withdrawAmount);
          break;
        case "balance":
          acc1.getBalance();
          break;
        case "freeze":
          acc1.freezeAccount();
          break;
        case "unfreeze":
          acc1.unfreezeAccount();
          break;
        case "exit":
          System.out.println("Exiting...");
          scanner.close();
          return;
        default:
          System.out.println("Invalid command. Please try again.");
      }

      
    }
  }
}

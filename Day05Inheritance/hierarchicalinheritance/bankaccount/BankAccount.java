package hierarchicalinheritance.bankaccount;

class BankAccount {
     // Declaring protected attributes for the BankAccount class
     protected String accountNumber;
     protected double balance;
 
     // Constructor to initialize BankAccount objects with provided values
     public BankAccount(String accountNumber, double balance) {
         this.accountNumber = accountNumber;
         this.balance = balance;
     }
 
     // Method to display account details
     public void displayAccountDetails() {
         System.out.printf("Account Number: %s, Balance: %.2f%n", accountNumber, balance);
     }
 
     // Method to be overridden in subclasses to specify the account type
     public void displayAccountType() {
         System.out.println("Generic Bank Account");
     }
 }

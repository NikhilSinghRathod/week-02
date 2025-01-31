package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list to store bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Creating objects for each account type and adding them to the list
        accounts.add(new SavingsAccount("SA001", "Alice", 7000, 3.5));
        accounts.add(new SavingsAccount("SA002", "Bob", 3000, 4.0));
        accounts.add(new SavingsAccount("SA003", "Clara", 10000, 3.0));
        accounts.add(new SavingsAccount("SA004", "David", 1500, 2.5));
        accounts.add(new SavingsAccount("SA005", "Eva", 8000, 3.2));
        accounts.add(new CurrentAccount("CA001", "Frank", 15000, 5000));
        accounts.add(new CurrentAccount("CA002", "Grace", 8000, 3000));
        accounts.add(new CurrentAccount("CA003", "Hank", 12000, 4000));
        accounts.add(new CurrentAccount("CA004", "Ivy", 18000, 7000));
        accounts.add(new CurrentAccount("CA005", "Jack", 9000, 3500));

        // Processing and displaying details of each account using polymorphism
        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);
            boolean isEligibleForLoan = ((Loanable) account).calculateLoanEligibility();
            System.out.println("Loan Eligibility: " + (isEligibleForLoan ? "Eligible" : "Not Eligible"));
            ((Loanable) account).applyForLoan(20000); // Applying for a loan of 20000
            System.out.println();
        }
    }
}

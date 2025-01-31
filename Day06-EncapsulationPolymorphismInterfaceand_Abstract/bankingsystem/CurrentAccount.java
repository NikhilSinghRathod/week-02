package bankingsystem;

// Creating a class CurrentAccount to represent specific current accounts inheriting from BankAccount (Subclass)
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    // Constructor to initialize CurrentAccount objects with provided values
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance); // Calling the superclass constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Implementing the calculateInterest() method for current accounts
    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    // Implementing the applyForLoan() method for current accounts
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for a loan of " + amount + " for current account.");
    }

    // Implementing the calculateLoanEligibility() method for current accounts
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Eligible if balance is at least 10000
    }
}

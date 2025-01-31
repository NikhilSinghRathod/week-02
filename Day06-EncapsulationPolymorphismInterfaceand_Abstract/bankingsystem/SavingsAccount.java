package bankingsystem;

// Creating a class SavingsAccount to represent specific savings accounts inheriting from BankAccount (Subclass)
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    // Constructor to initialize SavingsAccount objects with provided values
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance); // Calling the superclass constructor
        this.interestRate = interestRate;
    }

    // Implementing the calculateInterest() method for savings accounts
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    // Implementing the applyForLoan() method for savings accounts
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for a loan of " + amount + " for savings account.");
    }

    // Implementing the calculateLoanEligibility() method for savings accounts
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Eligible if balance is at least 5000
    }
}

package hierarchicalinheritance.bankaccount;

// Creating a class SavingsAccount to represent specific Savings Account inheriting from BankAccount (Subclass)
class SavingsAccount extends BankAccount {
    // Unique attribute for SavingsAccount
    private double interestRate;

    // Constructor to initialize SavingsAccount objects with provided values
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.interestRate = interestRate;
    }

    // Overriding the displayAccountType() method to specify the account type
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }

    // Method to display savings account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Calling the superclass method
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }
}


package hierarchicalinheritance.bankaccount;

// Creating a class FixedDepositAccount to represent specific Fixed Deposit Account inheriting from BankAccount (Subclass)
class FixedDepositAccount extends BankAccount {
    // Unique attribute for FixedDepositAccount
    private double maturityAmount;

    // Constructor to initialize FixedDepositAccount objects with provided values
    public FixedDepositAccount(String accountNumber, double balance, double maturityAmount) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.maturityAmount = maturityAmount;
    }

    // Overriding the displayAccountType() method to specify the account type
    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    // Method to display fixed deposit account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Calling the superclass method
        System.out.printf("Maturity Amount: %.2f%n", maturityAmount);
    }
}

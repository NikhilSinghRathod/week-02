package hierarchicalinheritance.bankaccount;

// Creating a class CheckingAccount to represent specific Checking Account inheriting from BankAccount (Subclass)
class CheckingAccount extends BankAccount {
    // Unique attribute for CheckingAccount
    private double withdrawalLimit;

    // Constructor to initialize CheckingAccount objects with provided values
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding the displayAccountType() method to specify the account type
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }

    // Method to display checking account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Calling the superclass method
        System.out.printf("Withdrawal Limit: %.2f%n", withdrawalLimit);
    }
}

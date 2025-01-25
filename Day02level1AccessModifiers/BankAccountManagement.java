// Base class: BankAccount
class BankAccount {
    // Public member: Accessible from anywhere
    public String accountNumber;

    // Protected member: Accessible within the package and subclass
    protected String accountHolder;

    // Private member: Accessible only within the class
    private double balance;

    // Constructor to initialize BankAccount details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
    }
}

// Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Interest earned: $" + interest);
    }

    // Display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber);  // Accessing public attribute
        System.out.println("Account Holder: " + accountHolder);  // Accessing protected attribute
        calculateInterest();
    }
}

// Main class to test the BankAccount and SavingsAccount classes
public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount acc1 = new BankAccount("123456", "John Doe", 5000.00);
        acc1.displayAccountDetails();
        
        // Performing deposit and withdrawal operations
        acc1.deposit(1500.00);
        acc1.withdraw(2000.00);
        acc1.displayAccountDetails();

        System.out.println("\n--------------------------------\n");

        // Creating a SavingsAccount object
        SavingsAccount savAcc = new SavingsAccount("987654", "Jane Smith", 10000.00, 3.5);
        savAcc.displaySavingsAccountDetails();
        
        // Performing deposit operation and interest calculation
        savAcc.deposit(2000.00);
        savAcc.displaySavingsAccountDetails();
    }
}

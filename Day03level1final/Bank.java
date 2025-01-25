class BankAccount extends Bank {
   //static variable 
   public String bankName ="Canara";

    // Public member: Accessible from anywhere
    public final int accountNumber;

    // Protected member: Accessible within the package and subclass
    protected String accountHolderName;;

    // Private member: Accessible only within the class
    private double balance;

    //public variable
     public static int totalAccounts = 0;

    // Constructor to initialize BankAccount details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolder;
        this.balance = balance;
        totalAccounts++;
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
       if(this instanceof BankAccount){
        System.out.println("Bank Name :"+bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + getBalance());
        System.out.println("obj is an instance ");
    }else{
        System.out.println("Not an instance ");
    }
  }

  //Display total Accounts method
  public static int  getTotalAccounts() {
    return totalAccounts;
  }

}
public class Bank {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(23456,"Anmol",5000);
        obj.displayAccountDetails();
        System.out.println("---------------");
        obj.deposit(4500.25);
        obj.withdraw(8000);
        obj.displayAccountDetails();
        System.out.println("---------------");
        BankAccount b2 = new BankAccount(789456, "Vishnu", 4500);
        b2.displayAccountDetails();
        System.out.println("---------------");
        System.out.println("Total Accounts :"+BankAccount.getTotalAccounts());

       }
 }


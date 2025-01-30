import java.util.ArrayList;
import java.util.List;

class Bank{
  //Attributes
  public String bankName;
  private ArrayList<Account>accounts;
  //paratermized constructor
  public Bank(String bankName){
     this.bankName = bankName;
     accounts = new ArrayList<>();
  }

  //method to get name
  public String getName(){
    return bankName;
  }

  //method to add Bank account
  public Account openAccount(Customer customer,double balance){
     Account open = new Account(customer ,this ,  balance);
     accounts.add(open);
     customer.addBankAccount(open);
     return open;
  }

  //method to show the details
  public void showAccount(){
    System.out.println("Bank name :"+bankName);
    for(Account account :accounts){
        account.displayAccountDetails();
    }
  }
}
class Account{
    //Attributes
   private Customer customer;
   private Bank bank; 
   private double balance;

   //parameterized constructor
   public Account(Customer customer,Bank bank,double balance){
    this.customer = customer;
    this.bank = bank;
    this.balance = balance;
   }

   //Method for the getters
   public Customer getCustomer(){
    return customer;
   }

   //method for the getters
   public Bank getBank(){
    return bank;
   }

   //method for the getters
   public double getBalance(){
    return balance;
   }
     //display method
   public void displayAccountDetails() {
    System.out.println("Customer: " + customer.getName() + ", Bank: " + bank.getName() + ", Balance: " + balance);
}
}
class Customer{
    //Attributes
   private String accountHolderName;
   private List<Account>accounts;

   //constructor
   public Customer(String name){
    this.accountHolderName = name;
    this.accounts = new ArrayList<>();
   }

   //Method to get name
   public String getName(){
    return accountHolderName;
   }

   public void addBankAccount(Account account){
    accounts.add(account);
   }
   public void viewBalance() {
    System.out.println(accountHolderName + "'s account balances:");
    for (Account account : accounts) {
        System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
    }
}
}
public class BankAccount {
    public static void main(String[] args) {
        Bank bank1 = new Bank("ABC Bank");
        Bank bank2 = new Bank("XYZ Bank");

        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Alice Smith");

        bank1.openAccount(customer1, 500);
        bank1.openAccount(customer2, 1000);
        bank2.openAccount(customer1, 200);

        bank1.showAccount();
        bank2.showAccount();

        customer1.viewBalance();
        customer2.viewBalance();
    }
}

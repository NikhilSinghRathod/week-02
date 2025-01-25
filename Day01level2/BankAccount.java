public class BankAccount {
    private String name;
    private int  accountNumber;
    static int balance;

    BankAccount(String name ,int accountNumber , int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        BankAccount.balance = balance;
    }
    
    //method for depositing money
    public  int DepositingMoney(int depositing){
        return BankAccount.balance +=  depositing;
    }

    //method for withdraw money
    public void withdrawMoney(int withdraw){
        if(balance>=withdraw){
         BankAccount.balance = balance - withdraw;
         System.out.println("Withdraw amount :"+withdraw);
         System.out.println("Available balancne : "+balance);
         }else{
            System.out.println("INSUFFICIENT BALANCE");
         }
    }
    //method for display balance
    public int displayBalance(){
        return BankAccount.balance;
    }

    //method to dispay the detail of the customer
    public void display(){
        System.out.println("The name of the Account Holder is :"+name);
        System.out.println(" Account Number :"+accountNumber);
        System.out.println("Balance :"+displayBalance());
        System.out.println();
    
    }

    public static void main(String[] args) {
        //creating the bank account object
        BankAccount bank = new BankAccount("Capgemini", 25654565, 0);
        
        bank.display();
        bank.DepositingMoney(2500);
        bank.display();
        bank.withdrawMoney(15000);
       
       
    
    }

}
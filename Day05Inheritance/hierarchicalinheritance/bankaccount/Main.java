package hierarchicalinheritance.bankaccount;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA123", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD123", 10000.0, 12000.0);

        // Displaying account types and details
        savings.displayAccountType();
        savings.displayAccountDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayAccountDetails();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}

package Inheritence.HierarchialInheritence;

class BankAccount {
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int termMonths;
    public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Term Duration: " + termMonths + " months");
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA674", 5000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA982", 3000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount("FD362", 10000, 12);
        savings.displayInfo();
        savings.displayAccountType();
        System.out.println();
        checking.displayInfo();
        checking.displayAccountType();
        System.out.println();
        fd.displayInfo();
        fd.displayAccountType();
    }
}


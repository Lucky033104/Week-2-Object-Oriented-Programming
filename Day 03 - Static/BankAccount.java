package Static;

public class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    private double balance;
    static String bankName = "Icici Bank";
    private static int totalAccounts = 0;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: ₹" + balance);
        }
        else {
            System.out.println("Invalid object. Not a BankAccount.");
        }
    }
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ICICI001", "Raja", 10000.0);
        BankAccount acc2 = new BankAccount("ICICI002", "Saab", 15000.0);
        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        System.out.println();
        BankAccount.getTotalAccounts();
    }
}

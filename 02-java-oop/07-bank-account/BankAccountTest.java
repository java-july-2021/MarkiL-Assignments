package BankAccount;

java.utils.*;


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        System.out.println(acc1.this.accountNumber());

        BankAccount acc2 = new BankAccount();
        System.out.println(acc2.this.accountNumber());

        System.out.println("The total number of accounts is: " + BankAccount.numberOfAccounts);

        System.out.println("The total amount invested in accounts is: " + BankAccount.totalAmount());
    }
}
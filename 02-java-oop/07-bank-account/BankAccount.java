package BankAccount;

import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static int totalAmount;

    public BankAccount(String accountNumber, double checkingBalance, double savingsBalance) {
        this.accountNumber = this.randomNumber();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        totalAmount++;
    }

    public String randomNumber() {
        Random accNum = new Random();
        System.out.println(accNum.nextInt(899999999)+1000000000); 
        return Integer.toString(accNum.nextInt(899999999)+1000000000);
    }

    public String getAccountNumber(String randomNumber) {
        return accountNumber;
    }

    public void depositChecking(double amount) {
        checkingBalance = 0;
        checkingBalance = checkingBalance + amount;
    }

    public void depositSavings(double amount) {
        savingsBalance = 0;
        savingsBalance = savingsBalance + amount;
    }

    public void withdrawChecking(double amount) {
        checkingBalance = 0;
        checkingBalance = checkingBalance - amount;
        if (checkingBalance <= 0) {
            System.out.println("Withdrawal cancelled for insufficient funds");
        }
    }

    public void withdrawSavings(double amount) {
        savingsBalance = 0;
        savingsBalance = savingsBalance - amount;
        if (savingsBalance <= 0) {
            System.out.println("Withdrawal cancelled for insufficient funds");
        }
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static int countAccounts(int numberOfAccounts){
        numberOfAccounts = 0;
        numberOfAccounts++;
        return numberOfAccounts;        
    }

    public static int countAmount(int totalAmount){
        totalAmount = 0;
        totalAmount++;
        return totalAmount;
    }
}

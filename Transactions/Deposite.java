package Transactions;

import Account.SavingAccounts;

public abstract class Deposite implements Transaction {
    private static double balance = 0.0; // The amount to be deposited
    static double amount;
    public static  void deposite(double amount) {
        // double totalBalance = 0.0;
       // totalBalance += amount;
        balance += amount;
        System.out.println("Deposite of Rs" + amount + " succesfully done.\nThe current balance is " + balance);
        Withdrawal.setBalance(balance);
    }
        public static double getBalance() {
        return balance;
    }
        public static void setBalance(double balance2) {
            balance=balance2;
        }
}

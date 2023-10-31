package Transactions;

public abstract class Withdrawal implements Transaction {
    private static double balance = 0.0; // The amount to be deposited
    static double amount=500.0;
    public static void withdrawal(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of Rs." + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public static double getBalance() {
      return balance;
    }

    public static void setBalance(double balance1) {
        balance=balance1;
        
    }
}

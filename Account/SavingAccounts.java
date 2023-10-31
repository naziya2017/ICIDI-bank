package Account;
    import java.util.HashMap;
   import Transactions.*;
   public class SavingAccounts {
       // Properties
       public double balance=0.0;
      
       public  static HashMap<String, Double> accountBalanceMap=new HashMap<>();
        static HashMap<String, String> pinToAccount=new HashMap<>();
          
       public SavingAccounts() {
           // Initialize the HashMap to store PINs as keys and account numbers as values.
           pinToAccount = new HashMap<>();
       }
   
       public static void addAccount(String pin,String accountNumber,double balance) {
           // Add a new account with the given PIN.
           pinToAccount.put(accountNumber,pin);
           accountBalanceMap.put(accountNumber,balance);
           Deposite.setBalance(balance);
       }
   
       public static String getPin(String accountNumber) {
           // Retrieve the account number associated with a PIN.
           if (pinToAccount.containsKey(accountNumber)) {
               return pinToAccount.get(accountNumber);
           } else {
               return "PIN not found";
           }
       }
   
       public String removeAccount(String pin) {
           // Remove an account and its associated PIN from the HashMap.
           if (pinToAccount.containsKey(pin)) {
               pinToAccount.remove(pin);
               return "Account removed";
           } else {
               return "PIN not found";
           }
       }
   
       public static double getBalance(String pin) {
          // Retrieve the Balance associated with a PIN.
        if (accountBalanceMap.containsKey(pin)) {
            return accountBalanceMap.get(pin);
        } else {
            return 0.0;
        }
       }
   
       public void setBalance(double balance) {
           this.balance = balance;
       }
       public static HashMap<String, String> getPinToAccount() {
        return pinToAccount;
    }

    public static void setPinToAccount(HashMap<String, String> pinToAccount) {
        SavingAccounts.pinToAccount = pinToAccount;
    }
   }
   
   
    
    
    


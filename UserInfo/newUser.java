package UserInfo;
import Account.*;
import java.util.ArrayList;
import java.util.HashSet;
import Transactions.*;
import java.util.ArrayList;
import java.util.Random;

 class AccountNumberGenerator {
    private static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static final Random random = new Random();

    // Simulate a list of account numbers and PINs
    private static ArrayList<AccountInfo> accountInfoList = new ArrayList<>();

    // Generate a new distinct account number with a PIN
    public static String generateAccountNumber() {
        String accountNumber;
        String pin;
        do {
            accountNumber = generateRandomAccountNumber();
        } while (!isDistinct(accountNumber));

        accountInfoList.add(new AccountInfo(accountNumber));
        return accountNumber;
    }

    // Generate a random 10-digit account number
    private static String generateRandomAccountNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    // Check if the generated account number is distinct
    private static boolean isDistinct(String accountNumber) {
        for (AccountInfo info : accountInfoList) {
            if (info.getAccountNumber().equals(accountNumber)) {
                return false;
            }
        }
        return true;
    }

    // Class to store account number and PIN together
    private static class AccountInfo {
        private String accountNumber;
       

        public AccountInfo(String accountNumber) {
            this.accountNumber = accountNumber;
           
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }
}


public class newUser extends AccountNumberGenerator {
          double totalBalance=0.0;

    // Properties
    protected String fName;
     protected String lName;
    private String address;
    private int age;
    private String pin;
    protected long AadharNo;
    protected long contact;
    protected String accountNumber;
    ArrayList<String> pinNumbers = new ArrayList<>();
    public Object User;
    // Constructor(s)
   public newUser() {

    }
  public newUser(int nn) {
         System.out.println( "\nWelcome to ICIDI Bank\nTo open a new Account you have to open it on minimum balance of 1000rs please First Fill some Personal Information:\n");

}
 // Methods
    public void openCurrentAccount(String myPin, String accountNum,double balance) {
               SavingAccounts.addAccount(myPin,accountNum,balance);
    }
    public void openSavingsAccount(String myPin, String accountNum,double balance) {
        SavingAccounts.addAccount(myPin,accountNum,balance);   
    }
     public void deposite(double nextDouble) {   
        Transactions.Deposite.deposite(nextDouble);
    }
    public void withdrawal(double nextDouble) {
         Transactions.Withdrawal.withdrawal(nextDouble);
    }
      public int getPin(String next,String Pin) {
        String n=SavingAccounts.getPin(next);
        if(n.equals(Pin)){
            return 1;
        }
        else 
        {   System.out.println("account not found");
            return 0;
    }
}
    public void getBalance(String pin2) {
      totalBalance+=  SavingAccounts.getBalance(pin2);
      System.out.println("Your current balance is "+totalBalance);
    }
// getters and setters
    public Long getcontact() {
        return contact;
    }

    public void setContact(Long get) {
        this.contact = get;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setPin(String pin) {
        this.pin = pin;

    }

    public long getAadharNo() {
        return AadharNo;
    }

    public void setAadharNo(long aadharNo) {
        AadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setAccountNumber() {
        this.accountNumber = generateAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setFName(String next) {
    }
    public void setLName(String next) {
    }
}

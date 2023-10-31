package UserInfo;
import java.util.Scanner;

import Account.*;
import Management.InterestCalculator;
public class User extends newUser {
  Scanner sc=new Scanner(System.in);
      public void getAccount(String pin){
            SavingAccounts.getPinToAccount();
              }
      public User(newUser n){

      }
      public User(String pin){

      }
    public void deposite (double depo1) {
        Transactions.Deposite.deposite(depo1);
    }
    public void withdrawal(double nextDouble) {
        Transactions.Withdrawal.withdrawal(nextDouble);
   }
    public double getInterest(double currentBalance) {
      System.out.println("Enter the time for which you have to calculate the interest");
      int time=sc.nextInt();
      double ans=InterestCalculator.calculateSimpleInterest(currentBalance,time);
      System.out.println("For the time period of "+time+" the interest on your account will be "+ans);
      ans+=currentBalance;
      System.out.println("Your current balance is "+ans);
      return ans;
    }
    public double getCInterest(double currentBalance) {
       System.out.println("Enter the time for which you have to calculate the interest");
      int time=sc.nextInt();
      int cf=4;
      double ans=InterestCalculator.calculateCompoundInterest(currentBalance,time,cf);
      System.out.println("For the time period of "+time+" the compound interest on your account will be "+ans);
      ans+=currentBalance;
      System.out.println("Your current balance is "+ans);
      return ans;
    }
}

import java.util.*;
import Account.SavingAccounts;
import Transactions.Deposite;
import Transactions.Withdrawal;
//import Account.*;
//import Management.*;
//import Transactions.*;
import UserInfo.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Our Bank\n");
        newUser n = new newUser();
        int sOc;
        do {
            System.out.println("\nIf you want to open a new account press 1\nIf you are existing User press 2");
            switch (sc.nextInt()) {
                case 1:
                    int nn = 1;
                    n = new newUser(nn);
                    try {
                        System.out.println("Enter your Name: ");
                        n.setName(sc.next());
                        System.out.println("\nEnter your age: ");
                        n.setAge(sc.nextInt());
                        System.out.println("\nEnter your contact Number: ");
                        n.setContact(sc.nextLong());
                        System.out.println("\nEnter your Aadhar Number: ");
                        n.setAadharNo(sc.nextLong());
                        n.setAccountNumber();
                        System.out.println("\nYour Account Number is :");
                        String accountNum = n.getAccountNumber();
                        System.out.println(accountNum);
                        System.out.println("\nSet a 4 digit pin for all confidential activity of your account");
                        String myPin = sc.next();
                        n.setPin(myPin);
                        System.out.println("Enter amount of or more than 1000 Rs: ");
                        double depo = sc.nextDouble();
                        if (depo >= 1000) {
                            n.deposite(depo);
                            n.openSavingsAccount(myPin, accountNum, depo);
                        } else
                            System.out.println("Starting Amount of less than 1000 not valid");
                    } 
                    catch (Exception e) {
                        System.out.println("Enter Valid Data");
                    }
                    break;
                case 2:
                    System.out.println(
                            "\nHello sir/Ma'am, Enter 4 digit to pin to login to your account and your account number: \n");
                    User n1 = new User(n);
                    final String pin = sc.next();
                    String accountNum = sc.next();
                    int bool = n.getPin(accountNum, pin);
                    if (bool == 1) {
                        System.out.println(
                                "press 1:Checking current balance\n      2:Deposite\n      3:Withdraw\n      4.Calculate Simple Interest\n      5.Calculate Compound Interest");
                        switch (sc.nextInt()) {
                            case 1:
                                double currentBalance = Deposite.getBalance();
                                System.out.println("Your current balance is " + currentBalance);
                                SavingAccounts.accountBalanceMap.put(pin, currentBalance);
                                break;
                            case 2:
                                System.out.println("Enter the amount to be deposited");
                                double depo1 = sc.nextDouble();
                                n1.deposite(depo1);
                                break;
                            case 3:
                                System.out.println("Enter the amount you want to withdraw");
                                double withd = sc.nextDouble();
                                n1.withdrawal(withd);
                                Deposite.setBalance(Withdrawal.getBalance());
                                break;
                            case 4:
                                currentBalance = Deposite.getBalance();
                               currentBalance+=n1.getInterest(currentBalance);
                                SavingAccounts.accountBalanceMap.put(pin, currentBalance);
                                break;
                            case 5:
                             currentBalance = Deposite.getBalance();
                             currentBalance+=n1.getCInterest(currentBalance);
                             SavingAccounts.accountBalanceMap.put(pin, currentBalance);

                            default:
                                    System.out.println("Enter valid choice");
                                break;
                        }
                        break;
                    }
                default:
                    System.out.println("Thanks for visiitng ICIDI bank");
                    break;
            }
            System.out.println("Do you want to continue the process press 1");
        } while (sc.nextInt() == 1);
        sc.close();
    }
}

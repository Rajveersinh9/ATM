package bankproject;

import java.util.Scanner;

public class AtmSystem {
private double  accountBalance;
private String transaction;
private final String userID;
private final int pin;
public AtmSystem(String user, int pinValue,double balance,String trans)
{
   accountBalance=balance;
   transaction=trans;
   userID=user;
   pin=pinValue;
}
public boolean ValidateAccount()
{
    return userID.equals("John") && pin==1234;
}
public void performTransaction()
{
  boolean isValid=ValidateAccount();
  if(isValid)
  {
    System.out.println("The current Balance:=$"+accountBalance);      
    
    if(transaction.equals("Withdraw"))
            {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the amount you want to withdraw:");
             
             double amount=sc.nextDouble();
             
             if((accountBalance>amount)&&((accountBalance-amount)>=1000))
                     {
                         System.out.println("Transaction Successful");
                         System.out.println("Your new balance:=$"+(accountBalance-amount));
                     }
             else
             {
                         System.out.println("Transaction Failed:");
                         System.out.println("Insufficient Fund in the account. You need to maintain at least $1000 in the account");
             }
            }
    if(transaction.equals("Deposit"))
            {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the amount you want to Deposit:");
             
             double amount=sc.nextDouble();
             
                         System.out.println("Transaction Successful");
                         System.out.println("Your new balance:=$"+(accountBalance+amount));
             
            }
  }
  else
  {
      System.out.println("Validation Failed");
  }
}
}

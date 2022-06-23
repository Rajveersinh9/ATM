package bankproject;

import java.util.Scanner;

/**
 The ATM System allows only two types of transaction ; Deposit or Withdraw
 * There is no limit of depositing amount to the account however you can not withdraw amount if the balance goes down
 * to $1000.
 * First you will execute this program with user name : John and password : 1234
 
 */
public class BankProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM System.");
        System.out.println("Enter user name:");
        String user=sc.next();
        System.out.println("Enter Pin Code:");
        int pincode=sc.nextInt();
        System.out.println("So, what you do want to do today? type either 'Deposit' or 'Withdraw'");
        String tranType=sc.next();
        AtmSystem atm=new AtmSystem(user,pincode, 1200,tranType);
        atm.performTransaction();
        
    }

}

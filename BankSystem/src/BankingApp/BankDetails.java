package BankingApp;

import java.util.Scanner;

public class BankDetails {
 private String accno;
 private  String name;
 private  String accType;
 private long balance;

 Scanner input=new Scanner(System.in);
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno= input.next();
        System.out.print("Enter Account Type: ");
        accType=input.next();
        input.nextLine();
        System.out.print("Enter Name: ");
        name= input.nextLine();
        System.out.print("Enter Balance: ");
        balance= input.nextLong();
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + accType);
        System.out.println("Balance: " + balance);
    }


    public void Deposit() {
        System.out.println("Enter the amount you want to deposit:");
        long amount= input.nextLong();
        balance+=amount;
    }

    public void Withdrawal() {
        System.out.println("Enter the amount you want to Withdraw:");
        long amount= input.nextLong();
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Balance after withdrawal"+balance);
        }else {
            System.out.println("Your balance is less than"+amount+"\tTransaction failed>....!");
        }
    }
    public boolean search(String acc_No) {
        if (accno.equals(acc_No)){
            showAccount();
            return true;

        }
        return false;
    }
}

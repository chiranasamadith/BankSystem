package BankingApp;

import java.util.Scanner;

public class bankingApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many number of customers do you want to input: ");
        int num=input.nextInt();

        BankDetails bank[]=new BankDetails[num];
        for (int i=0; i<bank.length; i++) {
            bank[i] = new BankDetails();
            bank[i].openAccount();

        }
        int ch;
            do {
                System.out.println("****************************  Banking Application System   *********************************");
                System.out.println("1.Display All Account Details");
                System.out.println("2.Search by  Account Number");
                System.out.println("3.Deposit The Amount");
                System.out.println("4.Withdraw The Amount");
                System.out.println("5.Exit");

                System.out.println("Enter your Choice");
                ch=input.nextInt();

                switch (ch){
                    case 1:
                        for (int i=0; i<bank.length; i++){
                            bank[i].showAccount();
                        }
                    case 2:
                        System.out.println("Enter Acc No.you Want to search: ");
                        String acc_no=input.next();
                        boolean found=false;
                        for(int i=0; i< bank.length; i++) {
                            found = bank[i].search(acc_no);
                            if(found){
                                break;
                            }
                        }
                            if(!found){
                                System.out.println("Search failed! Account doesn't exist....!!");
                            }
                            break;
                    case 3:
                        System.out.println("Enter Acc No    : ");
                         acc_no=input.next();
                         found =false;
                        for(int i=0; i< bank.length; i++) {
                            found = bank[i].search(acc_no);
                            if(found){
                                bank[i].Deposit();
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Search failed! Account doesn't exist....!!");
                        }
                        break;

                    case 4:
                        System.out.println("Enter Acc No    : ");
                        acc_no=input.next();
                        found =false;
                        for(int i=0; i< bank.length; i++) {
                            found = bank[i].search(acc_no);
                            if(found){
                                bank[i].Withdrawal();
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Search failed! Account doesn't exist....!!");
                        }
                        break;
                    case 5:
                        System.out.println("See You Soon!!!!!!");
                        break;
                        }

            }while (ch!=5);
        }
    }


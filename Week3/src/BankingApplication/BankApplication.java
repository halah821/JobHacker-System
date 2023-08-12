package BankingApplication;

import java.util.Random;
import java.util.Scanner;

public class BankApplication {
    static Bank bank = new Bank();

    public static void main(String[] args) {

        startApp();

    }

    public static void startApp(){
        System.out.println("__________________________________________________________________________");
        System.out.println("please choose:");
        System.out.println("- to exit App Type 0");
        System.out.println("- to create new account Type 1");
        System.out.println("- to make transaction to existing account Type 2");



        Scanner sc =new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 0:
                break;
            case 1:

                System.out.println("please enter your Name");
                String accountHolderName = sc.nextLine();
                System.out.println("please enter your starting balance");
                double myBalance =  sc.nextDouble();
                Random rand = new Random();
                Integer newAccountNumber = rand.nextInt(100);
                Account myNewAccount = new Account(newAccountNumber.toString(),accountHolderName,myBalance);
                bank.addNewAccount(myNewAccount);
                System.out.println("your Bank Account Created with this account number:"+newAccountNumber);
                startApp();
                break;

            case 2:

                System.out.println("please enter Account Number");
                String accountNumber =sc.nextLine();

                System.out.println("please choose transaction:");
                System.out.println("- to deposit Into account Type A");
                System.out.println("- to withdrawFromAccount Type B");
                System.out.println("- to display balance Type C");
                System.out.println("- to calculateInterestRateOfAccount Type D");

                char transaction = sc.next().charAt(0);

                switch (transaction){
                    case 'A':
                        System.out.println("please enter your deposit ");
                        Double depositAmount =sc.nextDouble();
                        bank.depositIntoAccount(accountNumber,depositAmount);
                        System.out.println( depositAmount +"$ Added to your Balance");
                        startApp();
                        break;

                    case 'B':
                        System.out.println("please enter Amount to make withdrawal  ");
                        Double withdrawAmount =sc.nextDouble();
                        bank.withdrawFromAccount(accountNumber,withdrawAmount);
                        System.out.println( withdrawAmount +"$ withdraw from your Balance");
                        startApp();
                        break;

                    case 'C':
                        System.out.println("Your Balance:  "+ bank.displayBalanceOfAccount(accountNumber));
                        startApp();
                        break;

                    case 'D':
                        System.out.println("Your Interest Rate Per Year is: "+ bank.calculateInterestRateOfAccount(accountNumber));
                        startApp();
                        break;

                }
                break;
        }
    }
}


package bankingapplication3;

import java.util.Scanner;


public class BankingApplication3 {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        
        int option=0,number;
        String name;
        double balance,amount;
        Account account;
        Bank bank =new Bank("");
        while(option !=6){
            System.out.println("Main Menu");
            System.out.println("1. Display all accounts");
            System.out.println("2. Open new account");
            System.out.println("3. Close existing account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println();
            
            System.out.print("Enter your choice: ");
            option=kb.nextInt();
            kb.nextLine();
            System.out.println();
            
            switch(option){
                case 1:
                    bank.listAccount();
                    break;
                case 2:
                    number=11111;
                    System.out.print("Enter account name: ");
                    name=kb.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance=kb.nextDouble();
                    account=new Account(number,name,balance);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    number=kb.nextInt();
                    bank.closeAccount(number);
                    break;
                case 4:
                    System.out.print("Enter Account number: ");
                    number=kb.nextInt();
                    account=bank.getAccount(number);
                    System.out.print("Enter Amount: ");
                    amount=kb.nextDouble();
                    bank.depositMoney(account, amount);
                    break;
                case 5:
                    System.out.print("Enter Account number: ");
                    number=kb.nextInt();
                    account=bank.getAccount(number);
                    System.out.print("Enter Amount: ");
                    amount=kb.nextDouble();
                    bank.withdrawMoney(account, amount);
            }
        }
    }
    
}

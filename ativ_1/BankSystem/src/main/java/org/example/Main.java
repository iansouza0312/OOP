package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter with your account number : ");
        int acc_number = sc.nextInt();

        System.out.println("Enter with your account holder : ");
        sc.nextLine();
        String acc_holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        if(resp == 'y'){
            System.out.println("Enter inital deposit value : ");
            double initalDeposit = sc.nextDouble();
            account = new Account(acc_number, acc_holder, initalDeposit);
        } else{
            account = new Account(acc_number, acc_holder);
        }

        System.out.println();
        System.out.println("Account Data Details: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated Account Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated Account Data: ");
        System.out.println(account);

        sc.close();
    }
}
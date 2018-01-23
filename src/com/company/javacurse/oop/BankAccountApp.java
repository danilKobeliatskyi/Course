package com.company.javacurse.oop;

public class BankAccountApp {

    public static void main(String[] args){

        BankAccount acc1 = new BankAccount();

        acc1.accountNumber = "51705710";

        acc1.setName("Roger Hue");
        System.out.println(acc1.getName());

        acc1.setSsn("234823423");
        System.out.println("SSN: " + acc1.getSsn());

        acc1.balance = 10000;
        acc1.setRate();
        acc1.increaseRate();

        acc1.deposit(1500);

        System.out.println(acc1.toString());

        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "51705710";

        BankAccount acc3 = new BankAccount("Checking Account", 5000);
        acc3.accountNumber = "51705710";
        acc3.checkBalance();

        /*
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.compound();
        */
    }
}

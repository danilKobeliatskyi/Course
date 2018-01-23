package com.company.javacurse.oop;

public class BankAccount implements IRate {

    private String name;

    static String accountNumber;

    private static final String routingNumber = "0123456";

    private String ssn;

    String accountType;

    double balance = 0;

    BankAccount(){

        System.out.println("NEW ACCOUNT CREATED");
    }

    BankAccount(String accountType){

        System.out.println("NEW ACCOUNT " + accountType);
    }


    BankAccount(String accountType, double initDeposit){

        System.out.println("NEW ACCOUNT " + accountType);
        System.out.println("INIT DEPOSIT OF: $ " + initDeposit);

        String Msg = "";

        if (initDeposit < 1000) {
            Msg = "ERROR: Minimum deposit must be at list $1,000";
        }
        else {
            Msg = "Thanks for your initial deposit of $" + initDeposit;
        }
        System.out.println(Msg);
        balance = balance + initDeposit;
    }

    public void setName(String name){

        this.name = "Mr. " + name;
    }

    public String getName() {
        return name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setRate(){

        System.out.println("SETTING RATE");
    }

    public void increaseRate(){

        System.out.println("INCREASING RATE");
    }

    void deposit(double amount){

        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount){

        balance = balance + amount;
        showActivity("WITHDRAW");
    }

    private void showActivity(String activity){

        System.out.println("YOU RECENT TRANSACTION: " + activity);
        System.out.println("NEW BALANCE IS: $" + balance);
    }

    void checkBalance(){

        System.out.println("Balance: " + balance);
    }

    void gerStatus(){


    }

    @Override
    public String toString(){

        return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + ". ROUTING# " + routingNumber + ". BALANCE: $" + balance + " ]";
    }
}

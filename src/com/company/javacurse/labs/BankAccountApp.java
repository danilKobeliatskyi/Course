package com.company.javacurse.labs;

public class BankAccountApp {

    public static void main(String[] args){

        BankAccount acc1 = new BankAccount("465329874", 1000.50);
        BankAccount acc2 = new BankAccount("325786752", 2000);
        BankAccount acc3 = new BankAccount("098743624", 2500);

        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest{
    private static int iD = 1000;
    private String name;
    private String accountNumber;
    private static final String routingNumber = "005400657";
    private String ssn;
    private String accountType;
    private double balance;

    public BankAccount(String SSN, double initDeposit){

        this.ssn = SSN;
        iD++;
        balance = initDeposit;
        setAccountNumber();
    }

    private void setAccountNumber(){

        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + ssn.substring(0, 1);
        System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount){

        balance = balance - amount;
        System.out.println("Paying bill: " + amount);
        showBalance();
    }

    public void makeDeposit(double amount){

        balance = balance + amount;
        System.out.println("Making deposit: " + amount);
        showBalance();
    }

    public void showBalance(){

        System.out.println("BALANCE: $" + balance);
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate / 100);
        showBalance();
    }

    @Override
    public String toString() {
        return "[NAME: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: $" + balance + "]";
    }
}
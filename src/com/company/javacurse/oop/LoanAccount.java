package com.company.javacurse.oop;

public class LoanAccount implements IRate{

    public void increaseRate() {

        System.out.println("Rate");
    }

    public void setRate() {

    System.out.println("Increase rate");
    }

    public void setTerm(int term){

        System.out.println("Setting the term to: " + term + " years");
    }

    public void setAmmortSchedule(){
        System.out.println("Amortization schedule");
    }
}

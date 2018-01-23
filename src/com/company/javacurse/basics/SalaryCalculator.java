package com.company.javacurse.basics;

public class SalaryCalculator {

    public static void main(String[] args){

        String career;
        System.out.println("Program a starting");
        career = "Software Developer";
        System.out.println("My career is: " + career);

        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;
        career = "Web developer";

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary is a: " + career + " at the rate of $ " + rate + " per hour is $" + salary + " per year");
    }
}

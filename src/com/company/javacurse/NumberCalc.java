package com.company.javacurse;

public class NumberCalc {

    public static void main(String[] args){

        System.out.println("Program si starting");

        int numA = 10;
        int numB = 20;

        printName();

        addNumbers(numA, numB);

        int product = multipleNumbers(numA, numB);
        //System.out.println("The product of " + numA + " and " + numB + " is " + multipleNumbers(numA, numB));
        System.out.println("The product of " + numA + " and " + numB + " is " + product);
    }

    static void printName(){

        System.out.println("my name is Daniel");
    }

    static void addNumbers(int numberA, int numberB){

        int sum = numberA + numberB;
        System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
    }

    static int multipleNumbers(int valueA, int valueB){

        int product = valueA * valueB;

        addNumbers(product + 50, product);

        return product;
    }
}

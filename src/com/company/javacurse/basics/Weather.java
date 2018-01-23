package com.company.javacurse.basics;

public class Weather {

    public static void main(String[] args){

        int temperature = 45;

        String sunConditional = "Overcast";

        if (temperature > 80)
            System.out.println("It`s pleasant. Wear short and T-shirt ");

        else if ((temperature > 60) && (sunConditional == "Sunny")) {
            System.out.println("It`s a little cooler. Perhaps wear a long-sleeve shirt and jeans");
            System.out.println("Waer a hat to keep the sun out of your eyes.");
        }

        else if ((temperature > 50) || (sunConditional == "Overcast"))
            System.out.println("This is a cool day, make sure to wear warmer clothes");

        else
            System.out.println("Looks like a cold day. Bring a sweater");

        System.out.println("Program is ending");
    }
}

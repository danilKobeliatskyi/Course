package com.company.javacurse.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVCard {

    public static void main(String[] args) {

        String dataRow;
        String[] line;
        double balance = 0;

        List<String[]> data = new ArrayList<String[]>();

        String fileName = "C:\\Users\\Danil\\IdeaProjects\\Files\\cart.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while ((dataRow = br.readLine()) != null) {

                line = dataRow.split(",");
                data.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] account : data) {
            System.out.print("[ ");
            for (String field : account) {
                System.out.print(field + " ");
            }
                if (account[1].contains("CREDIT")) {
                    double amount = Double.parseDouble(account[3]);
                    balance = balance + amount;
                    if (balance > 0) {
                        balance = balance - (amount / 10);
                        System.out.print("accounts withdrawn: " + amount / 10);
                    }
                    if (balance < 0)
                        System.out.print("Thanks for your payment, your overpayment is: $" + amount);
                    if (balance == 0)
                        System.out.println("Thanks for your payment");
                    System.out.print(" Yor balance is: $" + balance);
                }
                if (account[1].contains("DEBIT")) {
                double amount = Double.parseDouble(account[3]);
                    balance = balance - amount;
                    if (balance > 0) {
                        balance = balance - (amount / 10);
                        System.out.print("accounts withdrawn: " + amount / 10);
                    }
                    if (balance < 0)
                        System.out.print("Thanks for your payment, your overpayment is: $" + amount);
                    if (balance == 0)
                        System.out.println("Thanks for your payment");
                    System.out.print(" Yor balance is: $" + balance);
                }
            System.out.println(" ]");
        }
    }
}

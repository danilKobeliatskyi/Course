package com.company.javacurse.datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    public static void main(String[] args) {

        String dataRow;

        List<String[]> data = new ArrayList<String[]>();

        String fileName = "C:\\Users\\Danil\\IdeaProjects\\Files\\account.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while ((dataRow = br.readLine()) != null) {

                String[] line = dataRow.split(",");
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
            for (String field : account){
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}

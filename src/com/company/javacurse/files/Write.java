package com.company.javacurse.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args){

        String filename = "C:\\Users\\Danil\\IdeaProjects\\Files\\FileToWrite.txt";
        String message = "I write this message to a file";

        File file = new File(filename);

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(message);
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read data: " + filename);
            e.printStackTrace();
        }finally {
            System.out.println("Closing the file writer");
        }
    }
}

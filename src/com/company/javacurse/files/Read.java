package com.company.javacurse.files;

import java.io.*;

public class Read {

    public static void main(String[] args){

        String filename = "C:\\Users\\Danil\\IdeaProjects\\Files\\FileToRead.txt";
        String text = null;
        File file = new File(filename);

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            text = br.readLine();
            br.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found: " + filename);
            e.printStackTrace();
        }

        catch (IOException e) {
            System.out.println("ERROR: Could not read data: " + filename);
            e.printStackTrace();
        }

        finally {
            System.out.println("Finished reading the file");
        }

        System.out.println(text);
    }
}

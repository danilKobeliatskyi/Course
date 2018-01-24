package com.company.javacurse.labs;

import java.io.*;

public class PasswordApp {

    public static void main(String[] args) {

        String filename = "C:\\Users\\Danil\\IdeaProjects\\Files\\Password.txt";
        String[] passwords = new String[13];
        String password = null;
        File file = new File(filename);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found: " + filename);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read data: " + filename);
            e.printStackTrace();
        }

        for (int i = 0; i < passwords.length; i++) {
            password = passwords[i];
            try {

                if (password.substring(0, 9).equals("1")){
                    if (password.substring(0).equals("2")){
                        if (password.substring(0).equals("3")){
                            if (password.substring(0).equals("3")){
                                if (password.substring(0).equals("3")){
                                    if (password.substring(0).equals("3")){
                                        if (password.substring(0).equals("3")){
                                            if (password.substring(0).equals("3")){
                                                if (password.substring(0).equals("3")){
                                                    if (password.substring(0).equals("3")){ {
                    throw new NumbersException(password);
                }
                }}}}}}}}}}
                if (!password.matches("(?i).*[a-z].*")) {
                    throw new LettersException(password);
                }
                if (!password.contains("@") || !password.contains("#") || !password.contains("!")) {
                    throw new CharactersException(password);
                }

                System.out.println(password);
            } catch (NumbersException e) {
                System.out.println("ERROR: password have not numbers");
                System.out.println(e.toString());
            } catch (CharactersException e) {
                System.out.println("ERROR: password have not characteristics");
                System.out.println(e.toString());
            } catch (LettersException e) {
                System.out.println("ERROR: password have not letters");
                System.out.println(e.toString());
            }
        }
    }
}

class NumbersException extends Exception {
    String num;

    NumbersException(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ("Numbers: " + num);
    }
}
class LettersException extends Exception {

    String num;

    LettersException(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ("Letters: " + num);
    }
}

class CharactersException extends Exception {

    String num;

    CharactersException(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ("Characters: " + num);
    }
}

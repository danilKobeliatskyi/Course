package com.company.javacurse.datastructures;

public class Arrays {

    public static void main(String[] args){

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};

        for (int i = 0; i < 5; i ++ ){
            System.out.print(alphabet[i] + " ");
        }

        System.out.println("\n\n" + "Using length variable");

        int size = alphabet.length;
        for (int n = 0; n < alphabet.length; n ++){
            System.out.print(alphabet[n] + " ");
        }

        System.out.println("\n\n" + "Using For-Each method");

        for (String letter : alphabet)
            System.out.print(letter + " ");

        System.out.println("\n\n Double Arrays");

        String[][] users = {
                {"John", "Williams", "jw@testemail.com", "789798456"},
                {"Sarah", "Jackson", "sj@testemail.com", "4564564564"},
                {"Rachel", "Wallace", "rw@testemail.com", "9879876455"}
        };

        int numOfUsers = users.length;
        int numOfFields = users[0].length;

        System.out.println("Numer of users: " + numOfUsers);
        System.out.println("numer of fields: " + numOfFields + "\n");


        for (int i = 0; i < numOfUsers; i++) {
            for (int j = 0; j < numOfFields; j++){
                System.out.println(users[i][j]);
            }
        }

        for (int i = 0; i < numOfUsers; i++) {
            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String phone = users[i][3];
            System.out.println(firstName + " " + lastName + " " + email + " " + phone);
        }

        System.out.println("\n" + "Using For-Each method");

        for (String[] user : users){
            System.out.print("[ ");
            for (String field : user){
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}

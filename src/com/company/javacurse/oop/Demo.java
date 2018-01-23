package com.company.javacurse.oop;

class Person{

    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + "is walking");
    }

    void eat(){

        System.out.println(name + "is eating");
    }

    void slep(){

        System.out.println(name + " is sleeping");
    }
}

public class Demo {

    public static void main(String[] args){

        Person person = new Person();
        person.name = "Joe";;
        person.email = "joe@testemail.com";
        person.phone = "7897894564";

        person.walk();
        person.slep();

        Person person2 = new Person();
        person2.name = "Joe";;
        person2.email = "joe@testemail.com";
        person2.phone = "7897894564";

        String name = "Sarah";
        String email = "sarah@testemail.com";
        String phone = "21323123132";

        person2.slep();

        String name2 = "Sarah";
        String email2 = "sarah@testemail.com";
        String phone2 = "21323123132";


    }
}

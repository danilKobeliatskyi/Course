package com.company.javacurse.labs;

public class StudentDatabase {
    public static void main(String[] args){
        Student student1 = new Student("098743624");
        student1.setFirstName("Bill");
        System.out.print(student1.getFirstName());
        student1.setLastName(" Black");
        System.out.println(student1.getLastName());
        student1.setEmail();
        System.out.println(student1.getEmail());
        student1.enroll();
        student1.pay(400);
        student1.showCourse("JAVA");
        System.out.println(student1.toString());

    }
}

class Student implements Information{

    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String recordBook;
    private static final String university = "NURE";
    private static int studentID = 4000;
    private double balance;

    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setEmail(){
        email = firstName + studentID +"@testmail.com";
    }
    public String getEmail() {
        return "Your new email is: " + email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public Student(String SSN) {
        this.ssn = SSN;
        studentID++;
        setRecordBook();
    }
    private void setRecordBook() {
        int random = (int) (1000 + Math.random() * 9000);
        recordBook = studentID + "" + random + ssn.substring(5, 9);
        System.out.println("Your record book: " + recordBook);
    }
    public void enroll(){
        String enroll = firstName + lastName + "was enroll to " + university;
        System.out.println(enroll);
    }
    public void pay(double amount){
        balance = balance + amount;
        System.out.println("Paying: " + amount);
        checkBalance();
    }
    public void checkBalance(){
        System.out.println("BALANCE: $" + balance);
    }
    public void showCourse(String course){
        String courses = firstName + "visit the" + course + "course";
        System.out.println(courses);
    }
    @Override
    public String toString() {
        return "[NAME: " + firstName + lastName + "]\n[State: " + states + "]\n" + "[City: " + city + "]\n" + "[Student ID: " + studentID + "]\n" + "[Record book: " + recordBook + "]\n" + "[Student of " + university + " university]";
    }
}
interface Information {
    String phone = "1235467890";
    String states = "New Jersey";
    String city = "New York";
}
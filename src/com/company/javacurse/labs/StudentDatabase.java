package com.company.javacurse.labs;

public class StudentDatabase {
    public static void main(String[] args){
        Student student1 = new Student("098743624");
        student1.setFirstName("Bill");
        System.out.print(student1.getFirstName());
        student1.setLastName(" Black");
        System.out.println(student1.getLastName());
        System.out.println(student1.toString());

    }
}

class Student {

    private String firstName;
    private String lastName;
    private String ssn;
    private String recordBook;
    private static final String university = "NURE";
    private static int studentID = 4000;

    public void setFirstName(String name) {
        this.firstName = name;
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

        int random = (int) (Math.random() * 100);
        recordBook = studentID + "" + random + ssn.substring(0, 1);
        System.out.println("Your record book: " + recordBook);
    }
    @Override
    public String toString() {
        return "[NAME: " + firstName + lastName + "]\n[Student ID: " + studentID + "]\n" + "[Record book: " + recordBook + "]\n" + "[Student of " + university + " university]";
    }
}
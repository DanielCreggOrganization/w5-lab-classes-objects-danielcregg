package ie.atu.classesandobjects;

public class Student {
    // Instance variables
    String studentID;
    int age;
    boolean isRegistered;

    // Method to display the student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
        System.out.println("Registered: " + isRegistered);
    }
}
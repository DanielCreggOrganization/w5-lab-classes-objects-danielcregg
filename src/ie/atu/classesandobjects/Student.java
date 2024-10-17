package ie.atu.classesandobjects;

public class Student {
    // Instance variables
    String studentID;
    int age;
    boolean isRegistered;

    // Default constructor
    public Student() {
        studentID = "S00000";
        age = 18;
        isRegistered = false;
    }
    
    // Constructor
    public Student(String studentID) {
        this.studentID = studentID;
        age = 18;
        isRegistered = false;
    }

    // Constructor
    public Student(String studentID, int age, boolean isRegistered) {
        this.studentID = studentID;
        this.age = age;
        this.isRegistered = isRegistered;
    }

    // Method to display the student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
        System.out.println("Registered: " + isRegistered);
    }
}
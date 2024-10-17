package ie.atu.classesandobjects;

public class Student {
    // Static Field
    static int studentCount = 0;

    // Instance variables
    String studentID;
    int age;
    boolean isRegistered;

    // Default constructor
    public Student() {
        studentID = "S00000";
        age = 18;
        isRegistered = false;
        studentCount++;
    }

    // Constructor
    public Student(String studentID) {
        this.studentID = studentID;
        age = 18;
        isRegistered = false;
        studentCount++;
    }

    // Constructor
    public Student(String studentID, int age, boolean isRegistered) {
        this.studentID = studentID;
        this.age = age;
        this.isRegistered = isRegistered;
        studentCount++;
    }

    // Method to display the student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
        System.out.println("Registered: " + isRegistered);
    }

    // Static Method
    public static int getStudentCount() {
        return studentCount;
    }
}
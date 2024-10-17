package ie.atu.classesandobjects;

public class Student {
    // Static variable (AKA class variable) to keep track of the number of students.
    // This variable is shared among all objects of the  Student class.
    public static int studentCount = 0;

    // Instance variables
    String studentID;
    int age;
    boolean isRegistered;

    // Default constructor - no parameters
    public Student() {
        studentID = "S00000";
        age = 18;
        isRegistered = false;
        studentCount++;
    }

    // Constructor - one parameter
    public Student(String studentID) {
        this.studentID = studentID;
        age = 18;
        isRegistered = false;
        studentCount++;
    }

    // Constructor - three parameters
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

    // Static Method - you do not have to create a Student object to call this method
    public static int getStudentCount() {
        return studentCount;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Student ID: " + studentID + "\nAge: " + age + "\nRegistered: " + isRegistered;
    }
}
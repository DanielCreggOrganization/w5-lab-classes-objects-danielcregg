package ie.atu.classesandobjects;

public class Main {
   public static void main(String[] args) {
      // Create an object of the Student class for each constructor
      Student studentObject1 = new Student();
      Student studentObject2 = new Student("S00123");
      Student studentObject3 = new Student("S00456", 20, true);

      // Call the displayInfo method on each object
      studentObject1.displayInfo();
      studentObject2.displayInfo();
      studentObject3.displayInfo();

      // Call the static method getStudentCount
      System.out.println("Student Count: " + Student.getStudentCount());

      // Call the toString method on each object
      System.out.println(studentObject1);
      System.out.println(studentObject2);
      System.out.println(studentObject3);

   } // End of main method
} // End of Main class

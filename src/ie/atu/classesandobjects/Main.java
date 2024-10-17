package ie.atu.classesandobjects;

public class Main {
   public static void main(String[] args) {
      // Create an object of the Student class
      Student studentObject1 = new Student();
      Student studentObject2 = new Student("S00123", 20, true);


      // Call the displayInfo method on the studentObject1
      studentObject1.displayInfo();
      studentObject2.displayInfo();

      // Call the static method getStudentCount
      System.out.println("Student Count: " + Student.getStudentCount());
   }
}

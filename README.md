[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=16582481)
# Java Classes and Objects Lab

## Agenda

1. [Introduction](#1-introduction)
2. [Defining Classes](#2-defining-classes)
3. [Creating Objects](#3-creating-objects)
4. [Constructors](#4-constructors)
5. [The `this` Keyword](#5-the-this-keyword)
6. [Static Fields and Methods](#6-static-fields-and-methods)
7. [Overriding the `toString()` Method](#7-overriding-the-tostring-method)
8. [Summary and Further Reading](#8-summary-and-further-reading)

---

## 1. Introduction

### Explanation

Object-Oriented Programming (OOP) is a programming paradigm centered around the concept of "objects" that contain data and methods. In Java, OOP allows developers to create modular, reusable code by defining classes and creating objects from those classes.

**Key Concepts:**

- **Classes**: Blueprints or templates that define the structure (fields) and behavior (methods) of objects.
- **Objects**: Instances of classes that hold actual values and can perform actions defined by their class.

### Example

Consider a simple `Car` class that defines the blueprint for a car object.

```java
public class Car {
    // Fields
    String make;
    String model;
    int year;
    
    // Methods
    public void startEngine() {
        System.out.println("Engine started.");
    }
}
```

### UML Diagram for Car class

```mermaid
classDiagram
    class Car {
        - String make
        - String model
        - int year
        + startEngine()
    }
```

### DIY Coding Task

**Objective**: Think about real-world objects and how they can be represented as classes in Java.

**Task**:

1. Create a package named `ie.atu.classesandobjects`. All classes you create for this lab below will go in here.

---

## 2. Defining Classes

### Explanation

In Java, a class is defined using the `class` keyword followed by the class name and a pair of curly braces `{}`. Inside the class, you can define fields (attributes) and methods (behaviors).

**Syntax:**

```java
public class ClassName {
    // Fields (attributes)
    // Methods (behaviors)
}
```

### Example

Let's define a `Person` class with some attributes and methods.

```java
public class Person {
    // Fields
    String name;
    int age;

    // Methods
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}
```

### Mermaid Diagram

```mermaid
classDiagram
    class Person {
        - String name
        - int age
        + introduce()
    }
```

### DIY Coding Task

**Objective**: Create a `Student` class.

**Task**:

1. Define a class named `Student`.
2. Add fields: `String studentID`, `int age`, `boolean isRegistered`.
3. Write a method `displayInfo()` that prints the student's details.

**Sample Output when `displayInfo()` is called**:

```
Student ID: S00123
Age: 20
Registered: true
```

---

## 3. Creating Objects

### Explanation

An object is an instance of a class. It is created using the `new` keyword followed by the class constructor.

**Syntax:**

```java
ClassName objectName = new ClassName();
```

### Example

Using the `Person` class defined earlier, let's create an object.

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of Person class
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 25;

        // Calling the method
        person1.introduce(); // Output: Hi, I'm John Doe and I'm 25 years old.
    }
}
```

### Mermaid Diagram

```mermaid
sequenceDiagram
    participant Main
    participant Person
    Main->>Person: new Person()
    activate Person
    Person-->>Main: person1
    deactivate Person
    Main->>Person: set name and age
    Main->>Person: introduce()
```

### DIY Coding Task

**Objective**: Create an object of the `Student` class you defined in the previous section.

**Task**:

1. In a `Main.java` file, write the `main` method.
2. Create an instance of `Student`:
   - Assign values to its fields (`studentID`, `age`, `isRegistered`).
3. Call the `displayInfo()` method to print the student's details.

---

## 4. Constructors

### Explanation

Constructors are special methods used to initialize objects. They have the same name as the class and no return type.

- **Default Constructor**: Provided by Java if no constructors are defined. Initializes fields to default values.
- **Parameterized Constructor**: Allows you to set initial values for fields.

**Default Constructor Example:**

```java
public class Person {
    // Fields
    String name;
    int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }
}
```

**Parameterized Constructor Example:**

```java
public class Person {
    // Fields
    String name;
    int age;

    // Parameterized constructor
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }
}
```

### Mermaid Diagram

```mermaid
classDiagram
    class Person {
        - String name
        - int age
        + Person()
        + Person(String name, int age)
        + introduce()
    }
```

### Example

Using the `Person` class with constructors.

```java
public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        person1.introduce(); // Output: Hi, I'm Unknown and I'm 0 years old.

        // Using parameterized constructor
        Person person2 = new Person("Alice", 30);
        person2.introduce(); // Output: Hi, I'm Alice and I'm 30 years old.
    }
}
```

### DIY Coding Task

**Objective**: Add constructors to your `Student` class.

**Task**:

1. In your `Student` class, add:
   - A default constructor that sets default values for the fields (`studentID`, `age`, `isRegistered`).
   - A parameterized constructor that accepts `studentID`, `age`, and `isRegistered` as parameters.
2. Modify your `Main` class to:
   - Create a `Student` object using the default constructor and call `displayInfo()`.
   - Create another `Student` object using the parameterized constructor and call `displayInfo()`.
3. Compile and run your program to see both outputs.

**Sample Output**:

```
Student ID: N/A
Age: 0
Registered: false

Student ID: S00234
Age: 22
Registered: true
```

---

## 5. The `this` Keyword

### Explanation

The `this` keyword refers to the current object instance. It's commonly used to:

- Differentiate between class fields and parameters when they have the same name.
- Call other constructors in the same class.

**Example Usage:**

```java
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name; // 'this.name' refers to the class field
        this.age = age;
    }
}
```

### Mermaid Diagram

```mermaid
sequenceDiagram
    participant Person
    Note right of Person: Constructor call with parameters name and age
    Person->>Person: this.name = name
    Person->>Person: this.age = age
```

### Example

Implementing the `this` keyword in the `Student` class.

```java
public class Student {
    String studentID;
    int age;
    boolean isRegistered;

    // Default constructor
    public Student() {
        this("N/A", 0, false);
    }

    // Parameterized constructor using 'this'
    public Student(String studentID, int age, boolean isRegistered) {
        this.studentID = studentID;
        this.age = age;
        this.isRegistered = isRegistered;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Age: " + this.age);
        System.out.println("Registered: " + this.isRegistered);
    }
}
```

### DIY Coding Task

**Objective**: Practice using the `this` keyword.

**Task**:

1. Update your `Student` class:
   - Ensure that both constructors use the `this` keyword to refer to class fields.
   - In the default constructor, call the parameterized constructor using `this(...)`.
2. Use `this` in the `displayInfo()` method as shown.
3. Verify that your program still works as expected by compiling and running it.

---

## 6. Static Fields and Methods

### Explanation

Static fields and methods belong to the class itself rather than any instance (object) of the class. They are shared among all instances of the class.

- **Static Fields (Class Variables):** A single copy exists regardless of the number of instances.
- **Static Methods:** Can be called without creating an instance of the class.

**Key Points:**

- Use the `static` keyword to declare static fields or methods.
- Static methods cannot access instance variables (`non-static` fields) directly.

### Example

#### Counting Instances with a Static Field

Let's modify the `Student` class to keep track of the total number of `Student` objects created.

```java
public class Student {
    // Instance Fields
    String studentID;
    int age;
    boolean isRegistered;

    // Static Field
    static int studentCount = 0;

    // Parameterized constructor using 'this'
    public Student(String studentID, int age, boolean isRegistered) {
        this.studentID = studentID;
        this.age = age;
        this.isRegistered = isRegistered;
        studentCount++; // Increment static counter
    }

    public void displayInfo() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Age: " + this.age);
        System.out.println("Registered: " + this.isRegistered);
    }

    // Static Method
    public static int getStudentCount() {
        return studentCount;
    }
}
```

#### Main.java

```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S001", 20, true);
        Student s2 = new Student("S002", 22, false);
        Student s3 = new Student("S003", 21, true);

        // Display individual student info
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        // Access static field via class name
        System.out.println("Total Students: " + Student.getStudentCount());
    }
}
```

**Sample Output:**

```
Student ID: S001
Age: 20
Registered: true
Student ID: S002
Age: 22
Registered: false
Student ID: S003
Age: 21
Registered: true
Total Students: 3
```

### Mermaid Diagram

```mermaid
classDiagram
    class Student {
        - String studentID
        - int age
        - boolean isRegistered
        - static int studentCount
        + Student(String studentID, int age, boolean isRegistered)
        + displayInfo()
        + static getStudentCount() int
    }
    class Main {
        + main(String[] args)
    }
    Main --> Student : uses
```

### DIY Coding Task

**Objective**: Practice using static fields and methods.

**Task**:

1. Modify your `Student` class:
   - Add a static field `studentCount` to keep track of the number of `Student` instances.
   - Increment `studentCount` in each constructor.
   - Add a static method `getStudentCount()` that returns the value of `studentCount`.
2. Update your `Main` class:
   - Create multiple `Student` objects.
   - After creating them, print out the total number of students using `Student.getStudentCount()`.
3. Compile and run your program to see the total count.

---

## 7. Overriding the `toString()` Method

### Explanation

Every class in Java inherits from the `Object` class, which provides a `toString()` method that returns a string representation of the object. By default, it returns a string like `ClassName@hashcode`, which isn't very informative.

By overriding the `toString()` method, you can provide a meaningful string representation of your object.

**Default `toString()` Output:**

```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        // Output: Student@15db9742
    }
}
```

### Example

Overriding `toString()` in the `Student` class.

```java
public class Student {
    // Fields and constructors as before

    @Override
    public String toString() {
        return "Student{studentID='" + studentID + "', age=" + age + ", isRegistered=" + isRegistered + "}";
    }
}

// In Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("S00345", 21, true);
        System.out.println(student);
        // Output: Student{studentID='S00345', age=21, isRegistered=true}
    }
}
```

### Mermaid Diagram

```mermaid
sequenceDiagram
    participant Main
    participant Student
    Main->>Student: new Student("S00345", 21, true)
    Student-->>Main: student
    Main->>Student: System.out.println(student)
    Student->>Student: toString()
    Student-->>Main: String representation
    Main-->>Console: Output
```

### DIY Coding Task

**Objective**: Override the `toString()` method in another class.

**Task**:

1. Create a new class called `Book` with fields `title`, `author`, and `price`.
2. Add a parameterized constructor that initializes these fields.
3. Override the `toString()` method to return a string representation of the `Book`.
4. In your `Main` class, create a `Book` object and print it using `System.out.println(book);`.

**Sample Output**:

```
Book{title='Effective Java', author='Joshua Bloch', price=45.99}
```

---

## 8. Summary and Further Reading

In this lab, we've covered:

- **Defining Classes**: Understanding how to create classes in Java.
- **Creating Objects**: Learning how to instantiate objects from classes.
- **Constructors**: Using default and parameterized constructors to initialize objects.
- **The `this` Keyword**: Referring to the current object instance.
- **Static Fields and Methods**: Using static members that belong to the class rather than instances.
- **Overriding the `toString()` Method**: Providing meaningful string representations of objects.

### Further Reading

- **Official Documentation**:
  - [Java Tutorials - Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
  - [Using the `this` Keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html)
  - [Understanding Class Members](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)
  - [Overriding Methods](https://docs.oracle.com/javase/tutorial/java/IandI/override.html)
- **Books**:
  - *Head First Java* by Kathy Sierra & Bert Bates
- **Online Resources**:
  - [W3Schools Java Constructors](https://www.w3schools.com/java/java_constructors.asp)
  - [W3Schools Java Static Keyword](https://www.w3schools.com/java/java_class_members.asp)
  - [GeeksforGeeks - `this` Keyword in Java](https://www.geeksforgeeks.org/this-reference-in-java/)
  - [Overriding `toString()` Method](https://www.geeksforgeeks.org/overriding-tostring-method-in-java/)

---

**Congratulations!** You've now practiced creating and using classes, constructors, the `this` keyword, static fields and methods, and overriding the `toString()` method in Java. Keep experimenting with new classes and later we will explore inheritance, polymorphism, and other OOP concepts to deepen your understanding.

---

# End of Lab

This lab has introduced you to fundamental concepts of Java OOP, providing a solid foundation for further exploration. Remember to:

- Practice coding regularly to reinforce your understanding.
- Read documentation and tutorials to expand your knowledge.
- Experiment with your own classes and projects.

Happy coding!

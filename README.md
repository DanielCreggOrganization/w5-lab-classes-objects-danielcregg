# Java Classes and Objects Lab

## Agenda

1. [Introduction](#1-introduction)
2. [Defining Classes](#2-defining-classes)
3. [Creating Objects](#3-creating-objects)
4. [Constructors](#4-constructors)
5. [The `this` Keyword](#5-the-this-keyword)
6. [Overriding the `toString()` Method](#6-overriding-the-tostring-method)
7. [Summary and Further Reading](#7-summary-and-further-reading)

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

### DIY Task

**Objective**: Think about real-world objects and how they can be represented as classes in Java.

- Identify three real-world objects (e.g., `Bicycle`, `Book`, `Phone`).
- For each object, list potential fields (attributes) and methods (behaviors) it might have.

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

### DIY Task

**Objective**: Create a `Student` class.

#### Instructions:

1. Define a class named `Student`.
2. Add fields: `String name`, `int age`, `String studentID`.
3. Write a method `displayInfo()` that prints the student's details.
4. No constructors are needed at this point.

#### Sample Output:

```
Name: Alice Smith
Age: 20
Student ID: S00123
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

### DIY Task

**Objective**: Create an object of the `Student` class you defined in the previous section.

#### Instructions:

1. In your `Main` class, create an instance of `Student`.
2. Assign values to its fields.
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
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
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

### DIY Task

**Objective**: Add constructors to your `Student` class.

#### Instructions:

1. Add a default constructor that sets default values for the fields.
2. Add a parameterized constructor that accepts `name`, `age`, and `studentID`.
3. Modify your `Main` class to create `Student` objects using both constructors.

#### Sample Output:

```
Name: Unknown
Age: 0
Student ID: N/A

Name: Bob Johnson
Age: 22
Student ID: S00234
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

### Example

Implementing the `this` keyword in the `Student` class.

```java
public class Student {
    String name;
    int age;
    String studentID;

    // Parameterized constructor using 'this'
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student ID: " + this.studentID);
    }
}
```

### DIY Task

**Objective**: Practice using the `this` keyword.

#### Instructions:

1. Update your `Student` class constructors to use the `this` keyword.
2. Use `this` in the `displayInfo()` method as well.
3. Verify that your program still works as expected.

---

## 6. Overriding the `toString()` Method

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
        return "Student{name='" + name + "', age=" + age + ", studentID='" + studentID + "'}";
    }
}

// In Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Carol", 21, "S00345");
        System.out.println(student);
        // Output: Student{name='Carol', age=21, studentID='S00345'}
    }
}
```

### DIY Task

**Objective**: Override the `toString()` method in another class.

#### Instructions:

1. Create a new class called `Book` with fields `title`, `author`, and `price`.
2. Add a parameterized constructor.
3. Override the `toString()` method to return a string representation of the `Book`.
4. In your `Main` class, create a `Book` object and print it.

#### Sample Output:

```
Book{title='Effective Java', author='Joshua Bloch', price=45.99}
```

---

## 7. Summary and Further Reading

In this lab, we've covered:

- Defining classes and their importance in Java OOP.
- Creating objects from classes.
- Using constructors to initialize objects.
- Understanding and using the `this` keyword.
- Overriding the `toString()` method to provide meaningful object representations.

### Further Reading

- **Official Documentation**:
  - [Java Tutorials - Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
  - [Using the `this` Keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html)
  - [Overriding Methods](https://docs.oracle.com/javase/tutorial/java/IandI/override.html)
- **Books**:
  - *Head First Java* by Kathy Sierra & Bert Bates
- **Online Resources**:
  - [W3Schools Java Constructors](https://www.w3schools.com/java/java_constructors.asp)
  - [GeeksforGeeks - `this` Keyword in Java](https://www.geeksforgeeks.org/this-reference-in-java/)
  - [Overriding `toString()` Method](https://www.geeksforgeeks.org/overriding-tostring-method-in-java/)

---

**Congratulations!** You've now practiced creating and using classes, constructors, the `this` keyword, and overriding the `toString()` method in Java. Keep experimenting with new classes and explore inheritance, polymorphism, and other OOP concepts to deepen your understanding.

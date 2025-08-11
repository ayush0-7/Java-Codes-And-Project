
// 1
// Default Constructor
// Automatically created by Java if no constructor is defined.


// 2
// Parameterized Constructor

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old");
    }
}

// 3
// No-Argument Constructor
class Car {
    Car() {
        System.out.println("No-Argument Constructor");
    }
}

// 4
// copy constructor
class Book {
    String title;

    Book(String t) {
        title = t;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
    }

    void show() {
        System.out.println("Title: " + title);
    }
}

// 5
// Constructor Overloading
class Employee {
    String name;
    int age;

    Employee() {
        name = "Unknown";
        age = 0;
    }

    Employee(String n) {
        name = n;
        age = 0;
    }

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + ", " + age);
    }
}


public class Constructor {
    public static void main(String[] args) {
        //2
        Student s1 = new Student("Ayush", 18);
        s1.display();
        //3
        Car c = new Car();
        //4
        Book b1 = new Book("Java Programming");
        Book b2 = new Book(b1);  // Copy constructor

        b1.show();
        b2.show();
        //5
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ayush");
        Employee e3 = new Employee("Ravi", 25);

        e1.display();
        e2.display();
        e3.display();
    }
}

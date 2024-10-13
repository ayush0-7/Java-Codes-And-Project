package OOPS;

// Compile Time Polymorphism
class Student {
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

// Runtime Polymorphism
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

// Main
public class Polymorphism {
    public static void main(String[] args) {

        Student ob = new Student();
        String name = "Ayush";
        ob.age = 19;
        ob.displayInfo(name, ob.age);

    }
}

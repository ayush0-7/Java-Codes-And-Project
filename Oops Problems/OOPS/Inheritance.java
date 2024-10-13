package OOPS;

//Types of Inheritance 
//type 1 : Single inheritance
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

// Type 2 : Multilevel inheritance

class Shape1 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle1 extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

class EquilateralTriangle extends Triangle {
    int side;
}

// Type 3 : Hierarchical inheritance

class Shape2 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle2 extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
    /*
     * Type 4 : Hybrid inheritance : Hybrid inheritance is a combination of
     * simple, multiple inheritance and hierarchical inheritance.
     */

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area();
        t1.area(10, 10);
    }
}

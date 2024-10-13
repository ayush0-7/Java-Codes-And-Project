package OOPS;
// Encapsulation Example in Java
class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for 'name' field
    public String getName() {
        return name;
    }

    // Public setter method for 'name' field
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for 'age' field
    public int getAge() {
        return age;
    }

    // Public setter method for 'age' field
    public void setAge(int age) {
        // Adding validation to ensure age is a positive value
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }

    // A method to display Person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", 30);

        // Using getter methods to access private fields
        System.out.println("Person's name is: " + person.getName());
        System.out.println("Person's age is: " + person.getAge());

        // Using setter methods to update private fields
        person.setName("Jane Doe");
        person.setAge(25);

        // Displaying updated information
        person.displayInfo();

        // Trying to set an invalid age
        person.setAge(-5); // Output: Invalid age. Age must be greater than 0.
    }
}

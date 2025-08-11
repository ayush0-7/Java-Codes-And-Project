import java.util.Scanner;

abstract class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

class Course {
    int courseId;
    String coursename;

    Course(int courseId, String coursename) {
        this.courseId = courseId;
        this.coursename = coursename;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCoursename() {
        return coursename;
    }
}

interface Manageble {
    int Max_Courses = 5;
    void manageCourse(Course c);
}

class Student extends User implements Manageble {
    private static int idCounter = 100;
    private final int studentId;
    private Course courses[];
    private int courseCount;

    // Contructor
    public Student(String name, int age) {
        super(name, age);
        this.studentId = idCounter++;
        this.courses = new Course[Max_Courses];
        this.courseCount = 0;
    }

    // Overriding abstract method
    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Profile ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses Enrolled: ");
        if (courseCount == 0) {
            System.out.print("No courses enrolled.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i].getCoursename());
            }
        }
    }

    // Overloaded version
    public void displayDetails(boolean showCourses) {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (showCourses) {
            displayDetails();
        }
    }

    // Implementing the interface method
    @Override
    public void manageCourse(Course c) {
        if (courseCount < Max_Courses) {
            courses[courseCount++] = c;
            System.out.println("Course added: " + c.getCoursename());
        } else {
            System.out.println("Cannot enroll in more then " + Max_Courses + " courses.");
        }
    }

    public int getStudentId() {
        return studentId;
    }
}

class Admin extends User implements Manageble {
    private final String adminCode = "ADMIN123";

    // Contructor
    public Admin(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Admin Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Add course to the course database (array-based)
    @Override
    public void manageCourse(Course c) {
        if (Database.courseCount >= Database.Max_Courses) {
            System.out.println("Cannot add more courses. Limit reached.");
        } else {
            Database.courseList[Database.courseCount] = c;
            Database.courseCount++;
            System.out.println("Course added by admin: " + c.getCoursename());
        }
    }

    public void viewAllStudents() {
        System.out.println("\n--- All Registered Students ---");
        if (Database.studentCount == 0) {
            System.out.println("No students found.");
        } else {
            for (int i = 0; i < Database.studentCount; i++) {
                Database.studentList[i].displayDetails(false);
            }
        }
    }

    public void viewAllCourses() {
        System.out.println("\n--- Available Courses ---");
        if (Database.courseCount == 0) {
            System.out.println("No courses available.");
        } else {
            for (int i = 0; i < Database.courseCount; i++) {
                System.out.println(Database.courseList[i].getCoursename());
            }
        }
    }
}

// Database Class
class Database {
    public static final int Max_Student = 100;
    public static final int Max_Courses = 50;

    public static Student studentList[] = new Student[Max_Student];
    public static int studentCount = 0;

    public static Course courseList[] = new Course[Max_Courses];
    public static int courseCount = 0;

    public static void addStudent(Student s) {
        if (studentCount < Max_Student) {
            studentList[studentCount++] = s;
        } else {
            System.out.println("Student limit reached");
        }
    }

    public static Student findStudentById(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getStudentId() == id) {
                return studentList[i];
            }
        }
        return null;
    }
}

// Main Class
public class SMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("Admin", 30);

        // Add Sample Courses
        Database.courseList[Database.courseCount++] = new Course(1, "Math");
        Database.courseList[Database.courseCount++] = new Course(2, "Physics");

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Register Student");
            System.out.println("2. Student Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    Student s = new Student(name, age);
                    Database.addStudent(s);
                    System.out.println("Registered with ID: " + s.getStudentId());
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    Student student = Database.findStudentById(sid);
                    if (student == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    while (true) {
                        System.out.println("\n1. View Profile\n2. Enroll Course\n3. Logout");
                        int op = sc.nextInt();
                        if (op == 1)
                            student.displayDetails();
                        else if (op == 2) {
                            for (int i = 0; i < Database.courseCount; i++) {
                                System.out.println((i + 1) + ". " + Database.courseList[i].getCoursename());
                            }
                            System.out.print("Select course number: ");
                            int cno = sc.nextInt();
                            if (cno >= 1 && cno <= Database.courseCount) {
                                student.manageCourse(Database.courseList[cno - 1]);
                            } else {
                                System.out.println("Invalid course number.");
                            }
                        } else
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter admin password: ");
                    String pwd = sc.nextLine();
                    if (!pwd.equals("admin123")) {
                        System.out.println("Wrong password.");
                        break;
                    }
                    while (true) {
                        System.out.println("\n1. Add Course\n2. View Students\n3. View Courses\n4. Logout");
                        int aop = sc.nextInt();
                        sc.nextLine();
                        if (aop == 1) {
                            System.out.print("Enter course name: ");
                            String cname = sc.nextLine();
                            Course newC = new Course(Database.courseCount + 1, cname);
                            admin.manageCourse(newC);
                        } else if (aop == 2) {
                            admin.viewAllStudents();
                        } else if (aop == 3) {
                            admin.viewAllCourses();
                        } else
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
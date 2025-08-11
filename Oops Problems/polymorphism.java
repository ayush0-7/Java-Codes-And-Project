//1
// Automatic promotion
class test{
    void show(int a){
        System.out.println("int");
    }
    void show(String a){
        System.out.println("String");
    }
}

//2
// Method overloading
class demo{
    void show(Object a){
        System.out.println("object");
    }
    void show(String a){
        System.out.println("String");
    }
    void show(int... a){
        System.out.println("Varargs");
    }
}

// 3
// method overriding
class ride {
    void show(String a){
        System.out.println("1");
    }
}
class xyz extends ride{
    void show(String a){
        System.out.println("2");
    }
}

// main method overloading
public class polymorphism {
    public static void main(String[] args) {
        System.out.println("hello");
        polymorphism p = new polymorphism();
        p.main(2);
        test t = new test();
        // 1
        t.show(1); //Int 
        
        //2
        demo d=new demo();
        d.show(1,2,3,4);

        //3
        ride r=new ride();
        r.show(null);
        xyz x= new xyz();
        x.show(null);
    }
    public static void main(int a) {
        System.out.println("2");
    }
}

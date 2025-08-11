abstract class vehicle{
    int no_of_tyres;
    abstract void start();
}
class car extends vehicle{
    void start(){
        System.out.println("Start by key");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("Start by kick");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        car c= new car();
        c.start();
        bike b= new bike();
        b.start();
    }
}

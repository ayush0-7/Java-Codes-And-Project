public class Clases_object {
    
}
//by reference variable
class Animal{
    String color;
    int age;
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.color="black";
        dog.age=10;
        System.out.println(dog.color+"   "+dog.age);
    }
}


//By using method
class Animal2 {
    String color;
    int age;
    void init(String c, int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+"   "+age);
    }
    public static void main(String[] args) {
        Animal2 cat = new Animal2();
        cat.init("white", 5);
        cat.display();
    }
}
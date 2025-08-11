
class Animal3{
    void eat(){
        System.out.println("I'm Eating");
    }    
}
class Dog extends Animal3{
    void color(){
        System.out.println("Black");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.color();
        d.eat();
    }
}

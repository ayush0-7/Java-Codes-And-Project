// Use 1
class a{
    int a=10;
}
class b extends a{
    int a=20;
    void show(int a){
        System.out.println(a);  //30
        System.out.println(this.a);  //20
        System.out.println(super.a);  //10
    }
}

// use 2
class test{
    void m1(){
        System.out.println("I'm class test");
    }
}
class demo extends test{
    void m1(){
        System.out.println("I'm in class Demo");
    }
    void show(){
        m1();
        super.m1();
    }
}

//use 3
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // ✅ calls Parent's constructor
        System.out.println("Child constructor");
    }
}

public class Super_keyword {
   public static void main(String[] args) {
    //Use 1
    b ob = new b();
    ob.show(30);

    //use 2
    demo a=new demo();
    a.show();

    //use 3
   Child b= new Child();
   } 

}

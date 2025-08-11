// Use 1
class test {
    int i;

    void setvalue(int i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
    }
}

// Use 2
class use2 {
    void display() {
        System.out.println("Hello World");
    }

    void show() {
        this.display(); // display(); both are same
    }
}

// Use 3
class use3 {
    use3() {
        this(10); // this call para...constructor
        System.out.println("No agrs Constructor");
    }

    use3(int a) {
        System.out.println("Paramitrized Constructor");
    }
}

// Use 4
class use4{
    void m1(use4 a){
        System.out.println("Use 4");
    }
    void m2(){
        m1(this);
    }
}

// use 5
class use5{
    use5(){
    }
    use5(use5 t){
        System.out.println("use 5 class constructor");
    }
}
class demo extends use5{
     void demo1(){
     use5 u = new use5(this);
     }  
}

// use 6
class use6{
    //int a=1;
    use6 test(){
        return this;
    }
}

public class this_keyword {
    public static void main(String[] args) {
        test t = new test();
        t.setvalue(10);
        t.show();

        // use 3
        use3 a = new use3();

        //use4
        use4 b = new use4();
        b.m2();

        // use5
        demo ob = new demo();
        ob.demo1();

        //use 6
        use6 c = new use6();
        c.test();
    }
}

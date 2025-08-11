interface i1 {
    abstract void show();
}
class test implements i1{
    public void show(){
        System.out.println("Hello 1");
    }
}
public class Interface_code {
    public static void main(String[] args) {
        test t = new test();
        t.show();
    }
}

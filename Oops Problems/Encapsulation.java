class Employee{
    private int emp_id;
    public void setter(int id){
        emp_id=id;
    }
    public int getter(){
        return emp_id;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setter(100);
        System.out.println(e.getter());
    }
}

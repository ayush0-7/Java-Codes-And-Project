public class Factorial {

    void fact(int n , int m){
        if(n==0 || n==1){
            System.out.println(m);
            return;
        }
        m=m*n;
        fact(n-1,m);
    }
    public static void main(String[] args) {
        Factorial ob = new Factorial();
        ob.fact(0, 1);
    }
}

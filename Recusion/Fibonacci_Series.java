public class Fibonacci_Series {
    void fibo(int n,int a, int b){
        if(n==0)
        return;
        int c=a+b;
        System.out.println(c);
        fibo(n-1,b, c);
    }
    public static void main(String[] args) {
        Fibonacci_Series ob = new Fibonacci_Series();
        int a=0,b=1,n=7;
        System.out.println(a);
        System.out.println(b);
        ob.fibo(n-2,a,b);
    }
}

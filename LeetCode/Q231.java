public class Q231 {

    public static void main(String[] args) {
        int n=  256;
        long solve  = Math.round(Math.log(n)/Math.log(2));
        System.out.println(solve);
        if ( n == Math.pow(2, solve)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println((n & (n - 1)));
    }
}
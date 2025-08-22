public class Q507 {
    public static void main(String[] args) {
        int n=28;
        int sum =0;
        for (int i = 1; i <= n/2; i++) {
           if (n%i==0) {
            sum +=i;
           }
        }
        if (n==sum) {
            System.out.println(true);
        }
        else
        System.out.println(false);
    }
}

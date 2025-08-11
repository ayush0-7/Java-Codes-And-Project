public class Q263 {
public boolean isUgly(int n) {
        if (n <= 0) return false;
        
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
        public static void main(String[] args) {
            int a = 1;
            Q263 ob = new Q263();
            boolean k = ob.isUgly(a);
            System.out.println(k);
        }
}

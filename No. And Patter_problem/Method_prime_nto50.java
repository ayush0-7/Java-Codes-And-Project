import java.util.*;

public class Method_prime_nto50 {
    int prime(int a) {
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        if (c == 2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Method_prime_nto50 ob = new Method_prime_nto50();

        int n, k = 0, s;
        n = in.nextInt();
        while (k <= 50) {
            s = ob.prime(n);
            if (s == 1) {
                System.out.print(n + ",");
            }
            n++;
            k++;

        }
    }
} 
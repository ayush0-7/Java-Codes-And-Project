//Print x^n (with stack height = n)

import java.util.Scanner;

public class x_Power_n_SH_n {
    double pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n < 0) {
            return 1.0/pow(x, -n);
        } else {
           return x*pow(x, n-1);
        }
    }

    public static void main(String[] args) {
        x_Power_n_SH_n ob = new x_Power_n_SH_n();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x :");
        int x = in.nextInt();
        System.out.println("Enter n :");
        int n = in.nextInt();
        double s = ob.pow(x, n);
        System.out.println(s);
    }
}
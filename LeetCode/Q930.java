import java.util.*;

public class Q930 {
    static int atMost(int[] a, int goal) {
        if (goal < 0) {
            return 0;
        }
        int l = 0, s = 0, c = 0;
        for (int r = 0; r < a.length; r++) {
            s += a[r];
            while (s > goal) {
                s -= a[l];
                l++;
            }
            c += r - l + 1;
        }
        return c;
    }

    public static void main(String[] args) {

        int a[] = { 0, 0, 0, 0, 0 };
        System.out.println(atMost(a, 0)-atMost(a, 0-1));
    }
}

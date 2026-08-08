import java.lang.reflect.Array;
import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int l = 0, r = a.length - 1;
        while (k > 0) {
            int t = a[r];
            for (int i = r; i > l; i--) {
                a[i] = a[i - 1];
            }

            a[l] = t;

            k--;
        }
        System.out.println(Arrays.toString(a));
    }
}

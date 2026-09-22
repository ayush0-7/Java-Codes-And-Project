import java.util.Arrays;

/**
 * Q875
 */
public class Q875 {
    static int max(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = { 3, 6, 7, 11 };
        int h = 8;

        int l = 1, r = max(a);
        System.out.println(r);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int s = 0;
            for (int i = 0; i < a.length; i++) {
                s += a[i] / mid;
            }
            if (s <= h) {
                r = r - mid;
            } else {
                l += mid;
            }
            l++;
            r--;
        }
        System.out.println(l);
    }
}
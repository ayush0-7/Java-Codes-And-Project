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
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int s = 0;
            for (int i = 0; i < a.length; i++) {
                s +=(int) (a[i] + mid-1 )/ mid;
                System.out.println((int)Math.ceil((double)a[i]/mid)+"\t"+(int) (a[i] + mid-1 )/ mid);
            }
            System.out.println("----");
            if (s <= h) {
                r = mid -1;
            } else {
                l =mid +1;
            }
        }
        System.out.println("Ans: "+l);
    }
}
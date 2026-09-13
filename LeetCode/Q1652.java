import java.util.Arrays;

public class Q1652 {
    public static void main(String[] args) {
        int a[] = { 5, 7, 1, 4 };
        int k = 0;
        int b[] = new int[a.length];
        int r = 0, l = 0;
        while (r < a.length) {
            int s = 0;
            if (k == 0) {
                s=0;
            } else if (k > 0) {
                l = r + 1;
                for (int i = 1; i <= k; i++) {
                    if (l > a.length - 1) {
                        l = 0;
                    }
                    s += a[l];
                    l++;
                }
            }else{
                l = r - 1;
                for (int i = 1; i <= Math.abs(k); i++) {
                    if (l < 0) {
                        l = a.length - 1;
                    }
                    s += a[l];
                    l--;
                }
            }
            b[r] = s;
            r++;
        }
        System.out.println(Arrays.toString(b));
    }
}

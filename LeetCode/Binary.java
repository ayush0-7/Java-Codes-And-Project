/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        int a[] = { 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0 };
        int k = 3;
        int c = 0, max = 0;
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                c++;
            }
            while (c > k) {
                if (a[ind] == 0) {
                    c--;
                }
                ind++;
            }
            max = Math.max(max, i - ind + 1);
        }
        System.out.println(max);
    }
}
import java.util.Arrays;

public class Q1365 {
    public static void main(String[] args) {
        int a[] = { 8, 1, 2, 2, 3 };
        int count[] = new int[101];
        int k[] = new int[a.length];
        for (int i : a) {
            count[i]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                k[i] = 0;
            } else {
                k[i] = count[a[i] - 1];
            }
        }
        System.out.println(Arrays.toString(k));
    }
}

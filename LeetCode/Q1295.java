public class Q1295 {
    public static void main(String[] args) {
        int a[] = { 12, 345, 2, 6, 7896 };
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            int k = 0;
            while (a[i] != 0) {
                k++;
                a[i] /= 10;
            }
            if (k % 2 == 0) {
                c++;
            }
        }
    }
}

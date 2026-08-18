public class Q162 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1 };
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                System.out.println(i);
                return;
            }
        }
    }
}

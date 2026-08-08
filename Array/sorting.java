public class sorting {
    public static void main(String[] args) {
        int a[] = { 8, 4, 9, 2, 3, 1, 5 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}

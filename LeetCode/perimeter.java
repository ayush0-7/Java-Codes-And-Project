import java.util.Arrays;

public class perimeter {
    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 10 };
        Arrays.sort(a);
        int l = a.length;
        for (int i = l - 1; i > 1; i--) {
            if (a[i - 2] + a[i - 1] > a[i]) {
                System.out.println(a[i - 2] + a[i - 1] + a[i]);
                break;
            }
        }
        System.out.println("0");
    }
}

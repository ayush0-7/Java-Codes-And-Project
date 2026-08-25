/**
 * Q1550
 */
public class Q1550 {

    public static void main(String[] args) {
        int ar[] = {2,6,4,1};
        for (int i = 0; i < ar.length - 2; i++) {
            if (ar[i] % 2 != 0 && ar[i + 1] % 2 != 0 && ar[i + 2] % 2 != 0) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
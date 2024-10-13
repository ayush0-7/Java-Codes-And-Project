import java.util.Scanner;

public class Perfect_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[4][4];
        System.out.println("Enter");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = in.nextInt();

            }
            System.out.println();
        }
        int s = 0, c = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int k = 1; k <= a[i][j]; k++) {
                    if (a[i][j] % k == 0) {
                        sum += k;
                    }
                }
                if (sum == a[i][j]) {
                    s = s + a[i][j];
                    c++;
                }
            }
        }
        double avg =(double) s / c;
        System.out.println("Result : " + avg);
    }
}

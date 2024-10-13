import java.util.Scanner;

public class DDA_Filled_AntiClockWise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[4][4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                a[j][i] = in.nextInt();
            }
            System.out.println();
        }

        int val = 1; // Initialize value to be filled in matrix
        
        int m = 4; // row
        int n = 4; // coloumn
        int k = 0; // Starting row index
        int l = 0; // Starting Coloumn Index

        while (m > k && n > l) {
            // Fill the first column from top to bottom
            for (int i = k; i < m; i++) {
                a[i][l] = val++;
            }
            l++;

            // Fill the last row from left to right
            for (int i = l; i < n; i++) {
                a[m - 1][i] = val++;
            }
            m--;

            // Fill the last column from bottom to top
            if (l < n) {
                for (int i = m - 1; i >= k; i--) {
                    a[i][n - 1] = val++;
                }
                n--;
            }

            // Fill the first row from right to left
            if (k < m) {
                for (int i = n - 1; i >= l; i--) {
                    a[k][i] = val++;
                }
                k++;
            }
        }

        System.out.println("Print Anti ClockWise Array");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

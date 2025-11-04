package Pattern;

public class Pat1 {

    public static void main(String[] args) {
        int n = 4;
        int mat[][] = new int[n][n];
        int num = 1;
        // Loop over all diagonals
        for (int d = 0; d < 2 * n - 1; d++) {
            int startRow = (d < n) ? 0 : d - n + 1;
            int endRow = Math.min(d, n - 1);

            if (d % 2 == 0) {
                // even diagonal → top to bottom
                for (int r = startRow; r <= endRow; r++) {
                    int c = d - r;
                    mat[r][c] = num++;
                }
            } else {
                // odd diagonal → bottom to top
                for (int r = endRow; r >= startRow; r--) {
                    int c = d - r;
                    mat[r][c] = num++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
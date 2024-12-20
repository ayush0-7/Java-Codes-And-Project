import java.util.*;

public class DDA_Saddle_Point_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        // SADDLE POINT
        int min = 0, c = 0, k = 0, max = 0;
        for (int i = 0; i < a.length; i++, c++) {

            for (int j = 0; j < a.length; j++) {
                for (int j2 = 0; j2 < a.length; j2++) {
                    if (a[i][c] < a[i][j]) {
                        min = a[i][c];
                    }
                    if (a[i][c] > a[j][c]) {
                        max = a[i][c];
                    }
                }
            }
        }
        
    }
}

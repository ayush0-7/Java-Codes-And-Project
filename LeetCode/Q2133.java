public class Q2133 {
    public static void main(String[] args) {
         
    int r = 2, c = 2;
        int a[][] = { { 1, 2 }, { 3, 1 } };
        int b[][] = new int[r][c];
        int l = 0, m = 0;
        // int m = a.length, n = a[0].length;
        // if (m * n != r * c) {
        //     System.out.println(false);
        // }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) { 
                b[l][m] = a[i][j];
                m++;
                if (m==c) {
                    m=0;
                    l++;
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) { // FIXED
                System.out.print(b[i][j] + ",");
            }
            System.out.println();
        }
    }
}

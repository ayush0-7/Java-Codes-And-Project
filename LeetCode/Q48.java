public class Q48 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
        for (int i = 0; i < a.length; i++) {
            int l = 0;
            int r = a.length -1;
            while (l < r) {
                int t = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = t;
                l++;r--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
    }
}

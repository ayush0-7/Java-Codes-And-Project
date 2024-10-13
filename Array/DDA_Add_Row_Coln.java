import java.util.Scanner;

public class DDA_Add_Row_Coln {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[4][4];
        System.out.println("Enter 4 no. in DDA");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int sumi = 0, sumj = 0, idx = 0, c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sumi += a[i][j];
                System.out.print(a[i][j] + " ");

            }
            System.out.println("|" + sumi);
            sumi = 0;
        }
        System.out.println("____");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sumj += a[c][idx];
                c++;

            }

            System.out.print(sumj + " ");
            sumj = 0;
            idx++;
            c = 0;
        }
        in.close();
    }
}

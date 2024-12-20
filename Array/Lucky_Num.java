import java.util.Scanner;

class Lucky_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = in.nextInt();
        int a[] = new int['n'];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int cs = n;
        int step = 2;
        while (step <= cs) {

            for (int i = step - 1; i < cs; i += step) {
                // Shift elements left
                for (int j = i; j < cs - 1; j++) {
                    a[j] = a[j + 1];
                }
                cs--;
                i--; // Adjust index because elements are shifted
            }
            step++;
        }
        System.out.println("Lucky numbers up to " + n + ":");
        for (int i = 0; i < cs; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
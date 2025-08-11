import java.util.Scanner;
public class Rigthrotate {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(a.length);
        int n = sc.nextInt();
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.println("i: " + i);
            int d  = (i+n)%a.length;
            System.out.println("d: " + d);
            temp[d] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = temp[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

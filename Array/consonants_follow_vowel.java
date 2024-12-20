import java.util.Scanner;

public class consonants_follow_vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a[] = new char[10];
        char b[] = new char[10];
        System.out.println("Enter 10 letter in SDA");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.next().charAt(0);
        }
        int c=1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                b[i] = a[i];
            } else {
                b[a.length-1-c]=a[i];
                c++;
            }
        }
        System.out.println("Consonant Followed by Vowel : ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

import java.util.Scanner;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = in.nextLine();
        String st = " ";
        int l, t = 0;
        
        s = s.trim();
        s = s + " ";
        l = s.length();
        int sp = 0;
        int ep = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                t++;
            }
        }

        String a[] = new String[t];

        t = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            st += c;
            if (c == ' ') {
                st = st.trim();
                a[t] = st;
                t++;
                st = " ";
            }
        }
        int h = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].length() == a[j].length()) {
                    h++;
                }
            }
        }
        String k[] = new String[h];
        h = 0;
         for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].length() == a[j].length()) {
                    k[h] = a[i];
                }
            }
        }

        for (int i = 0; i < k.length-1; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i].compareTo(k[j]) > 0) {
                    String temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Words with the same length:");
        for (int i = 0; i <= a.length; i++) {
            System.out.println(k[i]);
        }
    }
}

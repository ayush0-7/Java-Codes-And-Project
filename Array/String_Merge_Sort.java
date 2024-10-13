import java.util.Scanner;

public class String_Merge_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Input
        String a[] = { "My", "Name", "Is", "Ayush" };
        String b[] = { "I", "Am", "java", "Coder" };
        int l = a.length + b.length;
        String c[] = new String[l];

        //Merging

        for (int i = 0; i < l; i++) {
            if (i < (a.length)) {
                c[i] = a[i];
            } else {
                c[i] = b[i - b.length];
            }
        }

        //Sorting

        int l1 = c.length;
        String t;
        for (int i = 0; i < l1 - 1; i++) {
            for (int j = i + 1; j < l1; j++) {
                if (c[i].compareTo(c[j]) > 0) {
                    t = c[j];
                    c[j] = c[i];
                    c[i] = t;
                }
            }
        }

        //Print

        for (int i = 0; i < l1; i++) {
            System.out.println(c[i]);
        }
    }
}

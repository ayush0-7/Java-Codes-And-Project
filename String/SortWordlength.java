import java.util.Scanner;

public class SortWordlength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = in.nextLine();
        String st = " ";
        int t = 0, l;
        s = s + " ";
        l = s.length();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                t++;
            }
        }
        String k[] = new String[t];
        t = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            st += c;
            if (c == ' ') {
                st = st.trim();
                k[t] = st;
                t++;
                st = " ";
            }
        }
        for (int i = 0; i < k.length - 1; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i].compareTo(k[j]) > 0) {
                    String temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }
}

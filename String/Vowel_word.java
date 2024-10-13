import java.util.*;
public class Vowel_word {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s,st="",str="";
        int i, j, l,k=0,g=0;
        s = in.nextLine();
        s = s + " ";
        l = s.length();
        for (i = 0; i < l; i++) {
            char c = s.charAt(i);
            st += c;
            if (c == ' ') {
                st = st.trim();
                int t = st.length();
                k = 0;
                for (j = 1; j < t; j++) {
                    char h = st.charAt(j);
                    if (h == 'a' || h == 'e' || h == 'i' || h == 'o' || h == 'u') {
                        k++;
                    }
                    if (k > g) {
                        g = k;
                        str = st;
                    }
                }
                st = " ";
            }
        }
        System.out.println(str.trim());
    }
}

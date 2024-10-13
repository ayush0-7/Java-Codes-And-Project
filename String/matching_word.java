import java.util.*;

public class matching_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, st, str = "", strr = "";
        s = in.nextLine();
        st = in.nextLine();
        s = s + " ";
        st = st + " ";
        int i, j, l, l1;
        l = s.length();
        l1 = st.length();
        for (i = 0; i < l; i++) {
            char c = s.charAt(i);
            str += c;
            if (c == ' ') {
                str = str.trim();
                for (j = 0; j < l1; j++) {
                    char h = st.charAt(j);
                    strr += h;
                    if (h == ' ') {
                        strr = strr.trim();
                        if (str.equals(strr)) {
                            System.out.println(strr);
                        }
                        strr = " ";
                    }
                }
                 str = " ";
            }
        }
    }
}

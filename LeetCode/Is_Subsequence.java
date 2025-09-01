public class Is_Subsequence {

    public static void main(String[] args) {
        String s = "", t = "hbgdca";
        int left =0 ,right = t.length()-1,c=0;
        char ch;
        boolean k= false;
        for (int i = 0; i < t.length(); i++) {
            if (c<s.length()) {
                ch = s.charAt(c);
            }
            else break;
            if (ch == t.charAt(i)) {
                c++;
            }
        }
        if (c==s.length()) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
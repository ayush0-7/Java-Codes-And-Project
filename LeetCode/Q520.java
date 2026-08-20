public class Q520 {
    public static void main(String[] args) {
        String s = "FlaG";
        int u=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                u++;
            }
        }
        boolean res = u == 0
                || u == s.length()
                || (u == 1 && Character.isUpperCase(s.charAt(0)));
        System.out.println(res);
    }
}

public class Q2269 {
    public static void main(String[] args) {
        int n = 240, k = 2;
        String s = Integer.toString(n);
        int r = 0, l = 0, c = 0;
        StringBuilder st = new StringBuilder();
        while (r < s.length()) {
            st.append(s.charAt(r));
            if (r - l + 1 == k) {
                int num = Integer.parseInt(st.toString());

                if (num != 0 && n % num == 0) {
                    c++;
                }
                st.deleteCharAt(0);
                l++;
            }
            r++;
        }
        System.out.println(c);
    }
}

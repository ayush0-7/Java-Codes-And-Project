public class Q08 {
    public static void main(String[] args) {
        String st = "1337c0d3";
        st = st.trim();
        String s = "";

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);

            if (i == 0 && (c == '-' || c == '+')) {
                s += c; 
            } else if (Character.isDigit(c)) {
                s += c;
            } else {
                break; 
            }
        }
        System.out.println( );
    }
}

public class Q151 {
    public static void main(String[] args) {
        String s = " example   good a";
        s=s+" ";
        String st="",str="";
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            st+=c;
            if (c == ' '&& Character.isAlphabetic(s.charAt(i+1))) {
                System.out.println(st);
                str = ' '+st.trim() + str;
                st="";
            }
        }
        System.out.println(str.trim());
    }
}

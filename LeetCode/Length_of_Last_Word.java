public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s="Hello World",st="";
        for (int i = s.length()-1; i >=0 ; i--) {
            char c=s.charAt(i);
            st=st+c;
            if (c==' ') {
                System.out.println(st.trim().length());
                break;
            }
        }
    }
}

public class Q2810 {

    public static void main(String[] args) {
        String s ="Striing";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch!='i') {
                sb = sb.append(ch);
            }
            if (ch=='i') {
                sb = sb.reverse();
            }

        }
        System.out.println(sb.toString().toLowerCase());
    }
}
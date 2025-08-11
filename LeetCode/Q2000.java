public class Q2000 {

    public static void main(String[] args) {
        String s = "abcdefgh",t="d";
        int left =0;
        int right = s.indexOf(t);
        StringBuilder sb = new StringBuilder(s);
        char temp ;
        while (left<right) {
          temp = sb.charAt(left);
         sb.setCharAt(left, sb.charAt(right));
         sb.setCharAt(right, temp);
         left++;
         right--;
        }
        System.out.println(sb.toString());
    }
}
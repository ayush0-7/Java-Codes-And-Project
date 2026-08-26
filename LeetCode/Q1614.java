/**
 * Q1614
 */
public class Q1614 {

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int k = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                k++;
            }
            if (c == ')') {
                max = Math.max(max, k);
                k--;
            }
        }
        System.out.println(max);
    }
}
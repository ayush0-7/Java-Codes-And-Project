public class Reverse_Only_Letters {

    public static void main(String[] args) {
        String s = "ab-cd";
        int left = 0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (left < right) {
            char c = s.charAt(left);
            char ch = s.charAt(right);
            if (Character.isAlphabetic(c) && Character.isAlphabetic(ch)) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            if (!Character.isAlphabetic(c)) {
                left++;
            }
            if (!Character.isAlphabetic(ch)) {
                right--;
            }
        }
        System.out.println();
    }
}

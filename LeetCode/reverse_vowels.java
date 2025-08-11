public class reverse_vowels {
    boolean isvowel(char l){
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E'
                    || l == 'I' || l == 'O' || l == 'U') {
            return true;
        }else
        return false;
    }
    void reverse(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (isvowel(l) && isvowel(r)) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            else
            if (!isvowel(l)) {
                left++;
            }
            if (!isvowel(r)) {
                right--;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        reverse_vowels ob = new reverse_vowels();
        ob.reverse(s);
    }
}

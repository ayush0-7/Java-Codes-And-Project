public class Valid_Palindrome_II {
    boolean palin(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        if (reversed.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    void validPalindrome(String s) {
        int left = 0 , right = s.length()-1;
        if (palin(s)) {
            System.out.println("True");
        } else {
           while (left<right) {
             char c = s.charAt(left);
            char ch = s.charAt(right);
           if (c==ch) {
            left++;
            right--;
           }
           if (palin(s.substring(left+1,right))) {
            System.out.println("True");
            break;
           }
           if (palin(s.substring(left,right-1))) {
            System.out.println("true");
            break;
           }
           else{
            left++;
            right--;
           }
           }
        }
    }

    public static void main(String[] args) {
        String s = "deeee";
        Valid_Palindrome_II ob = new Valid_Palindrome_II();
        ob.validPalindrome(s);
    }
}

public class longest_palindromic_String {
    boolean palin(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void longPalin(String str) {
         int n = str.length();
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (palin(str, i, j) && (j - i + 1 > maxLen)) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + str.substring(start, start + maxLen));
    
    }

    public static void main(String[] args) {
        longest_palindromic_String ob = new longest_palindromic_String();
        ob.longPalin("cbbd");
    }
}
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s).length());
    }

    public static String longestSubstring(String s) {
        String current = "";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));

            if (current.contains(ch)) {

                current = current.substring(current.indexOf(ch) + 1);
            }

            current += ch;

            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}

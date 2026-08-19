public class Q125 {
    class Solution {
    public static boolean isPalindrome(String s) {
        String s1="" ,s2="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                s1=s1+c;
                s2=c+s2;
            }
        }
        if (s1.trim().equalsIgnoreCase(s2.trim())) {
            return true;
        }else{
            return false;
        }
    }
}
    public static void main(String[] args) {
        
    }
}

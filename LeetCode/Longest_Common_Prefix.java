public class Longest_Common_Prefix {
    static String longestCommonPrefix(String[] strs) {
        String s="";
        for (int j = 0; j < strs.length; j++) {
            for (int i = 0; i < strs.length-1; i++) {
                if (strs[i].charAt(i)==strs[i].charAt(i+1)-1) {
                    s+=i;
                }
            }
        }
    }
}

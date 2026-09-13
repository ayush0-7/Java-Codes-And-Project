import java.util.HashMap;

public class Q1876 {
    public static void main(String[] args) {
        String s = "aababcabc";
        int r = 0, l = 0, k = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        while (r < s.length()) {
            char c = s.charAt(r);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            if (r - l + 1 == 3) {
                if (mp.size() == 3) {
                    k++;
                }
                char leftChar = s.charAt(l);

                if (mp.get(leftChar) == 1) {
                    mp.remove(leftChar);
                } else {
                    mp.put(leftChar, mp.get(leftChar) - 1);
                }
                l++;
            }
            r++;
        }
        System.out.println(k);
    }
}

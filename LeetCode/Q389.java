public class Q389 {
    public char findTheDifference(String s, String t) {
        boolean a = false;   
        char k = ' ';       
        int[] freq = new int[26];

        // count chars in s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // check chars in t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
            if (freq[t.charAt(i) - 'a'] < 0) {
                a = true;
                k = t.charAt(i);  
                break;
            }
        }

        if (!a) {
            return t.charAt(t.length() - 1);
        } else {
            return k;
        }
    }
}

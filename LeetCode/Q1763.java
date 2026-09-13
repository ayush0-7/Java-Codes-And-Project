import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1763 {
    public static void main(String[] args) {
        String s = "YazaAay";
        HashMap<Character, Integer> mp = new HashMap<>();
        int r = 1;
        String st = "";
        String res = "";
        int max = 0;
        while (r <= s.length()) {
            for (int i = 0; i < r; i++) {
                st = s.substring(i, r);
                mp.clear();
                for (int j = 0; j < st.length(); j++) {
                    mp.put(st.charAt(j), mp.getOrDefault(st.charAt(j), 0) + 1);
                }
                if (mp.size() == 2) {
                    List<Character> keys = new ArrayList<>(mp.keySet());
                    char firstKey = keys.get(0);
                    char secondKey = keys.get(1);
                    
                    // System.out.println(firstKey+"\t"+secondKey);
                    if (Character.toLowerCase(firstKey) == Character.toLowerCase(secondKey)) {
                        if (max < st.length()) {
                            max = st.length();
                            res = st;
                        }
                    }
                }
            }
            r++;
        }
        System.out.println(res);
    }
}

import java.util.HashMap;

public class Check_Anagram {
    public static void main(String[] args) {
        String s="listen",st="silent";
        HashMap<Character,Integer> map = new HashMap<>();
        if (s.length()!=st.length()) {
            System.out.println(false);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1) ;
        }
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            map.put(c, map.get(c) - 1);
        }
        for (var el : map.entrySet()) {
            if (el.getValue() != 0) {
                System.out.println(false);
                return;
            }
        }
            System.out.println(true);
    }
}

import java.util.HashMap;

public class count_char_inString {
    public static void main(String[] args) {
        String s = "programing";
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (!freq.containsKey(c)) {
                freq.put(c, 1);
            }else{
                freq.put(c, freq.get(c)+1);
            }
        }
        System.out.println(freq.entrySet());
    }
}

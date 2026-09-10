import java.util.ArrayList;

public class Q1358 {
    public static void main(String[] args) {
        String s = "abcda";
       int count[] = new int[3];
       int l = 0;
       int r = 0;
       for (int i = 0; i < count.length; i++) {
        count[s.charAt(i) - 'a']++;
        
       }
    }
}

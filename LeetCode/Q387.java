public class Q387 {

    public static void main(String[] args) {
        String s = "ayuasha";
        int[] freq = new int[26]; 

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(s.charAt(i));
                break;  
            }
        }
    }
}
public class Q1945 {
    public static void main(String[] args) {
        String s = "fleyctuuajsr";
        int num = 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((s.charAt(i) - 'a' + 1));
        }

        // Perform digit sum num times
        String digits = sb.toString();
        int sum = 0;
        
        while (num-- > 0) {
            sum = 0;
            for (char c : digits.toCharArray()) {
                sum += c - '0'; // sum of digits
            }
            digits = String.valueOf(sum);
        }

        System.out.println(sum);
    }
}

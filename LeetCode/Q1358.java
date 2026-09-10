public class Q1358 {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (ch == 'a') count[0]++;
            else if (ch == 'b') count[1]++;
            else if (ch == 'c') count[2]++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                answer += s.length() - right;
                char leftChar = s.charAt(left);
                if (leftChar == 'a') count[0]--;
                else if (leftChar == 'b') count[1]--;
                else if (leftChar == 'c') count[2]--;
                left++;
            }
        }

        return answer;
    }
}

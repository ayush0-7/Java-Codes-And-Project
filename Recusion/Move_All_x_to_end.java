public class Move_All_x_to_end {

    public static void Move(String s, int c, String st, String last) {
        // Base case: if we've processed the whole string
        if (s.length() == c) {
            System.out.println(st + last);  // Print the non-'x' part + 'x' part
            return;  // Stop further recursion
        }

        char k = s.charAt(c);
        // If the character is 'x', add it to the 'last' string
        if (k == 'x') {
            last += k;
        } else {
            // Otherwise, add it to the non-'x' string
            st += k;
        }
        
        // Recursive call with the same input string and updated result strings
        Move(s, c + 1, st, last);
    }

    public static void main(String[] args) {
        Move("axxbcxxd", 0, "", "");  // Expected output: "abcdxxxx"
    }
}

public class Q415 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String n1="121",n2="11";
        int i = n1.length() - 1;
        int j = n2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = 0;
            if (i >= 0) {
                digit1 = n1.charAt(i) - '0';
                i--;
            }

            int digit2 = 0;
            if (j >= 0) {
                digit2 = n2.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        System.out.println(result.reverse().toString());
    }
}

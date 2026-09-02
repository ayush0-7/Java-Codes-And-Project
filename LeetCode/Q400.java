public class Q400 {
    public static void main(String[] args) {
        int n = 100;

        if (n < 10) {
            System.out.println(n);
            return;
        }

        int digit = 1;
        long start = 1;
        long count = 9;

        while (n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = 9L * start * digit;
        }

        long number = start + (n - 1) / digit;
        int rem = (n - 1) % digit;

        String s = Long.toString(number);
        System.out.println(s.charAt(rem) - '0');
    }
}

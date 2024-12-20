// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

import java.util.Scanner;

public class Roman_to_Decimal {
    static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        // Loop through the string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = getValue(c);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            // Update previous value for next iteration
            prevValue = currentValue;
        }

        return total;
    }

    static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Roman No");
        String s=in.next();
        int k=romanToInt(s);
        System.out.println("Decimal No. : "+ k);
    }

}

package Projects.Pro_ChatBot;

import java.util.Scanner;

public class Guess_No_CB {
    
    public static void playGuessingGame() {
        Scanner in = new Scanner(System.in);
        int value = (int) (Math.random() * 100);
        boolean guess = true;
        System.out.println("Enter a Number between 1 to 100");
        int input = in.nextInt();
        
        while (guess) {
            if (input == value) {
                System.out.println("Yayy...You win ...! Number is : " + value);
                break;
            } else if (input > value) {
                System.out.println("Enter Smaller value");
                input = in.nextInt();
            } else if (input < value) {
                System.out.println("Enter greater value");
                input = in.nextInt();
            }
        }
    }
}

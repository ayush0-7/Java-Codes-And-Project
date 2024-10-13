package Projects;

import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value=(int)(Math.random()*100);
        boolean guess = true;
        System.out.println("Enter a Number between 1 to 100");
        int input = in.nextInt();
        while (guess) {
            if(input==value){
                System.out.println("Yayy...You win ...! Number is : "+value);
                break;
            }
            else if (input>value) {
                System.out.println("Enter Smaller value");
                input = in.nextInt();
            }
            else if (input<value) {
                System.out.println("Enter greater value");
                input = in.nextInt();
            }
        }
        in.close();
    }
}



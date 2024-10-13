package Projects;

import java.util.Scanner;

public class RPS_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean game = true;

        System.out.println(" Enter 'Exit' for end the game");

        // Computer :
        // 0 = Stone,
        // 1 = Paper,
        // 2 = Scissor  

        while (game) {

            int Computer = (int) (Math.random() * 3);
            String[] choices = {"Stone", "Paper", "Scissor"};
            String ComputerChoice = choices[Computer];

            System.out.println("Enter S : Stone \t P : Paper \t Sc : Scissor ");
            String userInput = in.nextLine().toLowerCase();
            userInput = userInput.trim();

            if (!userInput.equals("s") && !userInput.equals("p") && !userInput.equals("sc")) {
                System.out.println("Invalid input! Please enter 's', 'p', or 'sc'.");
                continue; //
            }

            if (userInput.equals("exit")) {
                System.out.println("Arigatou...!");
                break;
            }

            if ((Computer == 0 && userInput.equals("s")) || (Computer == 1 && userInput.equals("p")) || (Computer == 2 && userInput.equals("sc"))) {
                System.out.println("It's a Draw! Both chose " + ComputerChoice);
            } else if ((Computer == 0 && userInput.equals("p")) || (Computer == 1 && userInput.equals("sc")) || (Computer == 2 && userInput.equals("s"))) {
                System.out.println("Yayyy..! You win. Computer chose " + ComputerChoice);
            } else {
                System.out.println("You Lose. Computer chose " + ComputerChoice);
            }
        }
    }
}

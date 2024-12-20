
import java.util.Scanner;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Projects.*;
import java.awt.Desktop;
import java.net.URI;

public class MyChatbot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean Chatting = true;
        String userName = "";
        System.out.println("Wlecome to Chatbot..! Type 'Exit or bye' for End the Cnversation ");

        while (Chatting) {
            System.out.print("You : ");
            input = in.nextLine().toLowerCase();

            if (input.equals("exit") || input.equals("bye")) {
                System.out.println("ChatBot: bye! Have a great day...!");
                break;
            }

            // Calculator :

            else if (input.startsWith("calculate ")) {
                CalculatorCB cal = new CalculatorCB();
                // Extract the expression and pass it to the Calculator
                String expression = input.substring(10); // Extract the part after "calculate "
                double result = cal.calculateExpression(expression);
                System.out.println("ChatBot: The result is " + result);
            }

            // Games :

            else if (input.equals("game")) {
                System.out.println(
                        "Enter Your Choice \n 1 For TicTacToe \n 2 for Guess Number \n 3 for Rock Paper Scissor");
                int gamechoice = in.nextInt();
                in.nextLine();

                // TicTacToe
                if (gamechoice == 1) {
                    System.out.println("ChatBot: Let's play Tic-Tac-Toe!");
                    TicTacToe_CB.playGame();
                }
                // Guess Number
                else if (gamechoice == 2) {
                    System.out.println("ChatBot: Let's play Guess Number");
                    Guess_No_CB.playGuessingGame();
                }
                // Rock Paper Scissor
                else if (gamechoice == 3) {
                    System.out.println("Chatbot: Let's play Rock Paper Scissor");
                    RPS_game.playRPS();
                } else {
                    System.out.println("ChatBot: Invaild Input");
                }
            }

            // Chatting

            else {
                switch (input) {
                    // Hello
                    case "hi":
                    case "hello":
                    case "hey":
                        System.out.println("Chatbot: How can I assist you today.!");
                        break;

                    case "good":
                        System.out.println("Thank you veryyy muchhhh...!");
                        break;

                    case "how are you":
                    case "how are you today":
                        System.out.println("Chatbot: I am just a program , Thank You...!");
                        break;

                    // Q-Chatbot name

                    case "what is your name":
                        System.out.println("Chatbot: I am simple Chatbot...!");
                        break;

                    // What My ChatBot do question

                    case "what can you do":
                    case "waht can you do for me":
                        System.out.println("Chatbot: I can Answer Your Simple Questions");
                        break;

                    // Current Time

                    case "what's the time":
                    case "time":
                        LocalDateTime nowTime = LocalDateTime.now();
                        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
                        System.out.println("Chatbot: The current time is " + time.format(nowTime));
                        break;

                    // Date

                    case "what's the date":
                    case "date":
                        LocalDateTime date = LocalDateTime.now();
                        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        System.out.println("Chatbot: Today's date is " + dateFormat.format(date));
                        break;

                    // name of the User

                    case "what is my name":
                    case "my name":
                        // if (userName.isEmpty()) {
                        System.out.print("Chatbot: I don't know your name yet. \n What is it Enter? ");
                        userName = in.nextLine();
                        System.out.println("Chatbot: Nice to meet you, " + userName + "!");
                        // } else {
                        // System.out.println("Chatbot: Your name is " + userName + "!");
                        // }
                        break;

                    // Google search

                    case "search":
                        System.out.println("Chatbot: What would you like to search for?");
                        String searchTerm = in.nextLine();
                        String formattedSearchTerm = searchTerm.replace(" ", "+");
                        String url = "https://www.google.com/search?q=" + formattedSearchTerm;

                        System.out.println("Chatbot: Opening the browser to search for " + searchTerm);

                        // Open the default browser with the search URL
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop desktop = Desktop.getDesktop();
                                desktop.browse(new URI(url)); // Open the browser
                            } catch (Exception e) {
                                System.out.println(
                                        "Chatbot: Unable to open browser. Please visit the following URL manually:");
                                System.out.println(url);
                            }
                        } else {
                            System.out.println(
                                    "Chatbot: Desktop not supported. Please visit the following URL manually:");
                            System.out.println(url);
                        }
                        break;

                    // Thanks

                    case "thank you":
                        System.out.println("You're welcome!");
                        break;

                    default:
                        System.out.println("ChatBot: Sorry I didn't Understand ☹");
                        break;
                }
            }
        }

    }
}
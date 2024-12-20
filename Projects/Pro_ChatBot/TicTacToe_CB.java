

import java.util.Scanner;
public class TicTacToe_CB {


    public static void playGame() {
        char[][] board = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        char currentPlayer = 'X';
        boolean gameFinished = false;
        Scanner in = new Scanner(System.in);

        while (!gameFinished) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("---------");
                }
            }

            System.out.print("Player " + currentPlayer + " enter your move (row [0-2] and column [0-2]): ");
            int row = in.nextInt();
            int col = in.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;

                if ((board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer)
                        ||
                        (board[0][col] == currentPlayer && board[1][col] == currentPlayer
                                && board[2][col] == currentPlayer)
                        ||
                        (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
                        ||
                        (board[0][2] == currentPlayer && board[1][1] == currentPlayer
                                && board[2][0] == currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true;
                } else {
                    boolean isFull = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (board[i][j] == ' ') {
                                isFull = false;
                                break;
                            }
                        }
                    }
                    if (isFull) {
                        System.out.println("It's a draw!");
                        gameFinished = true;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
                    }
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}



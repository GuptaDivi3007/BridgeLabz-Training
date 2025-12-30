import java.util.*;

public class SnakeAndLadder {

    public static void main(String[] args) {


        // UC1: Snake and Ladder game played with single player at start position 0
        int player1Position = 0;
        int player2Position = 0;
        int diceCount = 0;
        int currentPlayer = 1;

        Random random = new Random();


        // UC4: Repeat till the player reaches the winning position 100
        while (player1Position != 100 && player2Position != 100) {


            // UC2: The player rolls the die to get a number between 1 to 6
            int diceNumber = random.nextInt(6) + 1;
            System.out.println("Player " + currentPlayer + " rolled dice: " + diceNumber);
            diceCount++;

            boolean extraTurn = false;


            // UC3: The player checks for an option – No Play, Ladder or Snake
            if (currentPlayer == 1) {

                int previousPosition = player1Position;
                int option = random.nextInt(3);

                if (option == 1) {
                    player1Position += diceNumber;
                    extraTurn = true;
                }
                else if (option == 2) {
                    player1Position -= diceNumber;
                }

                if (player1Position < 0) {
                    player1Position = 0;
                }
                

                // UC5: Ensure the player gets to the exact winning position 100
                if (player1Position > 100) {
                    player1Position = previousPosition;
                }

                System.out.println("Player 1 Position: " + player1Position);

            }
            else {

                int previousPosition = player2Position;
                int option = random.nextInt(3);

                if (option == 1) {
                    player2Position += diceNumber;
                    extraTurn = true;
                }
                else if (option == 2) {
                    player2Position -= diceNumber;
                }

                if (player2Position < 0) {
                    player2Position = 0;
                }


                // UC5: Ensure the player gets to the exact winning position 100
                if (player2Position > 100) {
                    player2Position = previousPosition;
                }

                System.out.println("Player 2 Position: " + player2Position);
            }


            // UC6: Report the number of times the dice was played and the position after every dice roll
            System.out.println("Dice rolled count: " + diceCount);


            // UC7: Play the game with 2 players and report which player won
            if (!extraTurn) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }

        if (player1Position == 100) {
            System.out.println("Player 1 Won");
        } else {
            System.out.println("Player 2 Won");
        }
    }
}

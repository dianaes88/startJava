import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessedNum;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start(Scanner sc) {
        Random rand = new Random();
        guessedNum = rand.nextInt(101);
        int attempt = 0;
        System.out.printf("%s and %s, welcome to the game. Try to guess a number from 0 to 100. Lets'start!\n", playerOne.getName(), playerTwo.getName());

        do {
            playerOne.setNumber(sc.nextInt());
            attempt = playerOne.getNumber();
            if (checkNumber(attempt, playerOne)) {
                break;
            }
            playerTwo.setNumber(sc.nextInt());
            attempt = playerTwo.getNumber();
        } while (!checkNumber(attempt, playerTwo));
    }

    //return true, if the number of player coincides guessed number
    private boolean checkNumber(int attempt, Player player) {
        if (attempt == guessedNum) {
            System.out.printf("%s, you win! My number is [%d]. Congratulations!\n", player.getName(), guessedNum);
            return true;
        }
        System.out.printf("My number is  %s, %s. Try again, please!\n",(attempt > guessedNum) ? "less than your" : "bigger than your", player.getName());
        return false;
    }
}


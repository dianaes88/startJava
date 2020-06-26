import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Random rand = new Random();
    private int guessedNumber;
    public Player playerOne;
    public Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        guessedNumber = 0;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void setGuessedNumber(int number) {
        this.guessedNumber = number;
    }

    public void start(Scanner sc) {
        System.out.println("Hello, please, enter your names:");
        playerOne.setName(sc.next());
        System.out.println("Player One: " + playerOne.getName());
        playerTwo.setName(sc.next());
        System.out.println("Player Two: " + playerTwo.getName());
        System.out.printf("%s and %s, welcome to the game. Try to guess a number from 0 to 100. Lets'start!\n", playerOne.getName(), playerTwo.getName());
        setGuessedNumber(rand.nextInt(101));
        int attemptNumber = 0;

        game:
        do {
            playerOne.setAttemptNumber(sc.nextInt());
            attemptNumber = playerOne.getAttemptNumber();
            if (checkNumber(attemptNumber)) {
                setWinner(playerOne);
                break game;
            } else {
                giveTheHint(attemptNumber, playerOne);
            }
            playerTwo.setAttemptNumber(sc.nextInt());
            attemptNumber = playerTwo.getAttemptNumber();
            if (checkNumber(attemptNumber)) {
                setWinner(playerTwo);
                break game;
            } else {
                giveTheHint(attemptNumber, playerTwo);
            }
        } while (attemptNumber != guessedNumber);
    }

    //return true, if the number of player coincides guessed number
    public boolean checkNumber(int attemptNumber) {
        if (attemptNumber == guessedNumber) {
            return true;
        }
        return false;
    }

    public void giveTheHint(int attemptNumber, Player player) {
        if (attemptNumber > guessedNumber) {
                System.out.printf("My number is less than your, %s. Try again, please!\n", player.getName());
            } else {
                System.out.printf("My number is bigger than your, %s. Try again, please!\n", player.getName());
            }
    }

    public void setWinner(Player player) {
        System.out.printf("%s, you win! My number is [%d]. Congratulations!\n", player.getName(), guessedNumber);
    }
}


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

    private void setGuessedNum(int number) {
        guessedNum = number;
    }

    public void start(Scanner sc) {
        Random rand = new Random();
        setGuessedNum(rand.nextInt(101));
        int attempt = 0;
        System.out.printf("%s and %s, welcome to the game. Try to guess a number from 0 to 100. Lets'start!\n", playerOne.getName(), playerTwo.getName());

        do {
            playerOne.setNumber(sc.nextInt());
            attempt = playerOne.getNumber();
            if (checkNumber(attempt, playerOne)) {
                setWinner(playerOne);
                break;
            }
            playerTwo.setNumber(sc.nextInt());
            attempt = playerTwo.getNumber();
            if (checkNumber(attempt, playerTwo)) {
                setWinner(playerTwo);
                break;
            }
        } while (attempt != guessedNum);
    }

    //return true, if the number of player coincides guessed number
    private boolean checkNumber(int attempt, Player player) {
        if (attempt == guessedNum) {
            return true;
        } else if (attempt > guessedNum){
            System.out.printf("My number is less than your, %s. Try again, please!\n", player.getName());
        } else {
            System.out.printf("My number is bigger than your, %s. Try again, please!\n", player.getName());
        }
        return false;
    }

    private void setWinner(Player player) {
        System.out.printf("%s, you win! My number is [%d]. Congratulations!\n", player.getName(), guessedNum);
    }
}


import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        System.out.println("Hello, please, enter your names:");
        Player playerOne = new Player(sc.next());
        System.out.println("Player One: " + playerOne.getName());
        Player playerTwo = new Player(sc.next());
        System.out.println("Player Two: " + playerTwo.getName());
        GuessNumber myGame = new GuessNumber(playerOne, playerTwo);
        do {
            myGame.start(sc);
            do {
                System.out.print("Хотите продолжить?(да/нет) ");
                answer = sc.next();
            } while (!(answer.equals("да") || answer.equals("нет")));
        } while (answer.equals("да"));
    }
}

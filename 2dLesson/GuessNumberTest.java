import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        Player playerOne = new Player();
        Player playerTwo = new Player();
        GuessNumber myGame = new GuessNumber(playerOne, playerTwo);
        do {
            myGame.start(sc);
            do{
                System.out.print("Хотите продолжить?(да/нет) ");
                answer = sc.next();
            } while (!(answer.equals("да") || answer.equals("нет")));
        } while (answer.equals("да"));
    }
}

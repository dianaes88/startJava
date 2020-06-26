import java.util.Random;

public class GuessNumberTest{

    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        GuessNumber myGame = new GuessNumber(playerOne, playerTwo);
        myGame.start();
    }
}

/*
*the user should guess a number from 0 to 10 the computer has choosen.
*hardcoded: guessed number is got from cmd arguments
***/
public class MyFirstGame {
    public static void main(String[] args) {
        int guessedNumber = Integer.parseInt(args[0]);
        int attemptNumber = 5;
        boolean isGuessed = false;
        System.out.println("Hi! Try to guess a number from 0 to 10.");
        do {
            System.out.printf("%d ?\n", attemptNumber);
            if (attemptNumber == guessedNumber) {
                System.out.printf("Yes! My number is %d. You won! Congratulations!\n", guessedNumber);
                isGuessed = true;
                break;
            } else if (attemptNumber > guessedNumber) {
                System.out.println("My number is less than your. Try again, please!");
                attemptNumber--;
            } else {
                System.out.println("My number is bigger than your. Try again, please!");
                attemptNumber+=2;
            }
        } while (!isGuessed);
    }
}

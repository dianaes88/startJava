import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean isOver = false;

        while (!isOver) {
            System.out.print("Ведите первое число: ");
            calc.setFirstNumber(sc.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.next().charAt(0));

            System.out.print("Ведите второе число: ");
            calc.setSecondNumber(sc.nextInt());

            System.out.println("Результат: " + calc.calculate());

            //check if the user wants to continue calculating
            String answer = new String();
            boolean isAnswerValid = false;
            do {
                System.out.print("Хотите продолжить?(да/нет) ");
                answer = sc.next();
                if (answer.equals("да")) {
                    isAnswerValid = true;
                } else if (answer.equals("нет")) {
                    isAnswerValid = true;
                    isOver = true;
                } else {
                    System.out.println("Ответ не понятен.");
                }
            } while (!isAnswerValid);
        }
        sc.close();
    }
}

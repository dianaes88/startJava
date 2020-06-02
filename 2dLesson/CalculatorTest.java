import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean isOver = false;
        String answer;

        do {
            System.out.print("Ведите первое число: ");
            calc.setFirstNumber(sc.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.next().charAt(0));

            System.out.print("Ведите второе число: ");
            calc.setSecondNumber(sc.nextInt());

            System.out.println("Результат: " + calc.calculate());

            //check if the user wants to continue calculating
            System.out.print("Хотите продолжить?(да/нет) ");
            answer = sc.next();
        } while (answer.equals("да"));
        sc.close();
    }
}

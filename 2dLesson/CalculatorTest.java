import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Ведите первое число: ");
        int firstNum = sc.nextInt();

        System.out.print("Введите знак математической операции: ");
        char sign = sc.next().charAt(0);

        System.out.print("Ведите второе число: ");
        int secondNum = sc.nextInt();

        System.out.print("Результат: " + calc.calculate(firstNum, secondNum, sign));
    }
}

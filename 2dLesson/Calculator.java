public class Calculator {
    protected int firstNumber;
    protected int secondNumber;
    protected long result;

    private void setNumbers(int num1, int num2) {
        firstNumber = num1;
        secondNumber = num2;
    }
    public String calculate(int num1, int num2, char sign) {
        this.setNumbers(num1, num2);
        switch(sign){
            case '+':
                return addition();
            case '-':
                return substraction();
            case '*':
                return multiplication();
            case '/':
                return division();
            case '^':
                return exponentiation();
            case '%':
                return modularAddition();
            default:
                return "Знак введен не верно!";
        }
    }
    private String addition() {
        result = firstNumber + secondNumber;
        return Long.toString(result);
    }
    private String substraction() {
        result = firstNumber - secondNumber;
        return Long.toString(result);
    }
    private String multiplication() {
        result = firstNumber * secondNumber;
        return Long.toString(result);
    }
    private String division() {
        if (secondNumber != 0) {
            result = firstNumber / secondNumber;
            return Long.toString(result);
        } else {
            return "Деление на ноль невозможно!";
        }
    }
    private String exponentiation() {
        long result = firstNumber;
        for (int i = 1; i < secondNumber; i++) {
            result *= firstNumber;
        }
        this.result = result;
        return Long.toString(this.result);
    }
    private String modularAddition() {
        if (secondNumber != 0) {
            result = firstNumber % secondNumber;
            return Long.toString(result);
        } else {
            return "Деление на ноль невозможно!";
        }
    }
}

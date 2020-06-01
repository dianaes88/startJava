public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private long result;
    private char sign;

    public void setFirstNumber(int num1) {
        firstNumber = num1;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int num2) {
        secondNumber = num2;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public String calculate() {
         switch(sign){
            case '+':
                return add();
            case '-':
                return substract();
            case '*':
                return multiply();
            case '/':
                return divide();
            case '^':
                return pow();
            case '%':
                return modularAdd();
            default:
                return "Знак введен не верно!";
        }
    }

    private String add() {
        result = firstNumber + secondNumber;
        return Long.toString(result);
    }

    private String substract() {
        result = firstNumber - secondNumber;
        return Long.toString(result);
    }

    private String multiply() {
        result = firstNumber * secondNumber;
        return Long.toString(result);
    }

    private String divide() {
        if (secondNumber != 0) {
            result = firstNumber / secondNumber;
            return Long.toString(result);
        } else {
            return "Деление на ноль невозможно!";
        }
    }

    private String pow() {
        long result = firstNumber;
        for (int i = 1; i < secondNumber; i++) {
            result *= firstNumber;
        }
        this.result = result;
        return Long.toString(this.result);
    }

    private String modularAdd() {
        if (secondNumber != 0) {
            result = firstNumber % secondNumber;
            return Long.toString(result);
        } else {
            return "Деление на ноль невозможно!";
        }
    }
}

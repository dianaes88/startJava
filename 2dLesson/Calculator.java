public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
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
         switch(sign) {
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
                return getRemainderOfDivision();
            default:
                return "Знак введен не верно!";
        }
    }

    private String add() {
        return Long.toString(firstNumber + secondNumber);
    }

    private String substract() {
        return Long.toString(firstNumber - secondNumber);
    }

    private String multiply() {
        return Long.toString(firstNumber * secondNumber);
    }

    private String divide() {
        if (secondNumber != 0) {
            return Long.toString(firstNumber / secondNumber);
        } else {
            return "Деление на ноль невозможно!";
        }
    }

    private String pow() {
        long result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result *= firstNumber;
        }
        return Long.toString(result);
    }

    private String getRemainderOfDivision() {
        if (secondNumber != 0) {
            return Long.toString(firstNumber % secondNumber);
        } else {
            return "Деление на ноль невозможно!";
        }
    }
}

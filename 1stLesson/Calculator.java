/*
*program does basic arithmetic operations.
*input data are transmitted as arguments in cmd : "3 + 5", etc.
*for division use ':'
*for multiplication use 'x'
**/
public class Calculator {
    public static void main(String[] args) {
        //parse operands
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s \n", i, args[i]);
        }
        if (args.length == 3) {
            int firstNum = Integer.parseInt(args[0]);
            int secondNum = Integer.parseInt(args[2]);
            char sign = args[1].charAt(0);
            long result = 0L;
            boolean isSuccessful = true;

            if (sign == '+') {
                result = firstNum + secondNum;
            } else if (sign == '-') {
                result = firstNum - secondNum;
            } else if (sign == ':') {
                //check if null
                if (secondNum == 0) {
                    System.out.println("Can't devide by zero!");
                    isSuccessful = false;
                } else {
                    result = firstNum/secondNum;
                }
            } else if (sign == 'x') {
                result = firstNum * secondNum;
            } else if (sign == '%') {
                //check if null
                if(secondNum == 0) {
                    System.out.println("Can't devide by zero!");
                    isSuccessful = false;
                } else {
                    result = firstNum % secondNum;
                }
            } else if (sign == '^') {
                result = firstNum;
                for (int i = 1; i < secondNum; i++)
                {
                    result *= firstNum;
                }
            } else {
                System.out.println("Unknown operation");
                isSuccessful = false;
            }

            if (isSuccessful) {
                System.out.println("The result is " + result);
            }
        } else {
            System.out.println("Incorrect operation");
        }
    }
}

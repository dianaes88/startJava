/*
*program does basic arithmetic operations.
*input data are transmitted as arguments in cmd : "3 + 5", etc.
*for division use ':'
*for multiplication use 'x'
**/
public class Calculator{
  public static void main(String[] args) {

    //parse operands
    for (int i=0;i<args.length;i++){
      System.out.printf("args[%d] = %s \n", i, args[i]);
    }
    if (args.length == 3){
      int nFirstOperand = Integer.parseInt(args[0]);
      int nSecondOperand = Integer.parseInt(args[2]);
      char chOperator = args[1].charAt(0);
      long result = 0L;
      boolean isSuccessful = true;
      //plus
      if (chOperator == '+'){
        result = nFirstOperand + nSecondOperand;
      }
      //minus
      else if(chOperator == '-'){
        result = nFirstOperand -nSecondOperand;
      }
      //division
      else if(chOperator == ':'){
        //check if null
        if (nSecondOperand == 0){
          System.out.println("Can't devide by zero!");
          isSuccessful = false;
        }
        else{
          result = nFirstOperand/nSecondOperand;
        }
      }
      //multiplication
      else if(chOperator == 'x'){
        result = nFirstOperand * nSecondOperand;
      }
      //modulo
      else if(chOperator == '%'){
        //check if null
        if(nSecondOperand == 0){
          System.out.println("Can't devide by zero!");
          isSuccessful = false;
        }
        else {
          result = nFirstOperand % nSecondOperand;
        }
      }
      //exponentiation
      else if(chOperator == '^'){
        result = nFirstOperand;
        for(int i= 1; i < nSecondOperand; i++)
        {
          result *= nFirstOperand;
        }
      }
      else{
        System.out.println("Unknown operation");
        isSuccessful = false;
      }
      if (isSuccessful){
        System.out.println("The result is " + result);
      }
    }
    else{
      System.out.println("Incorrect operation");
    }
  }
}

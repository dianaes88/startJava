public class Cycle{
  public static void main(String[] args) {
    //print numbers 0-20
    for (int i = 0;i <= 20;i ++){
      System.out.print(i + " ");
    }

    System.out.println();

    //print numbers -6 - 6; step=2
    int num = 6;
    while(num >= -6){
      System.out.print(num + " ");
      num -= 2;
    }
    System.out.println();
    //calculate and print sum of odd numbers 10-20
    int lowerBound = 10;
    int upperBound = 20;
    int sumOfoddNums = 0;
    int iNum = lowerBound;
    do{
      if ((iNum % 2) != 0){
        sumOfoddNums += iNum;
      }
      iNum ++;
    }
    while (iNum <= upperBound);
    System.out.println("Sum of odd nums from 10 to 20 is " + sumOfoddNums);
  }
}

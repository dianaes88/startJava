public class Variable{
  public static void main(String[] args){
    //primitive data types
    //integer types
    byte coreNumber = 6;
    System.out.println("The numbers of cores is " + Byte.toString(coreNumber));

    short OsVersionNumber = 10;
    System.out.println("The operation System version number is " + Short.toString(OsVersionNumber));

    int numberOfDrives = 2;
    System.out.println("The number of drives is " + Integer.toString(numberOfDrives));

    long numberOfProcessInUse = 250L;
    System.out.println("The number of processes in use is " + Long.toString(numberOfProcessInUse));

    //floating point
    double rumInGB = 16.07896543;
    System.out.println("RUM size is " + Double.toString(rumInGB) + "GB");

    float frequencyInGhz = 3.0012345F;
    System.out.println("The frequency of CPU is " + Float.toString(frequencyInGhz) + "GHz");

    //boolean type
    boolean isOsLinux = false;
    System.out.println("The sowtware is Linux " + Boolean.toString(isOsLinux));

    //char type
    char firstCharacterOfName = '\u006E';
    System.out.println("The first character of the computer name is " + Character.toString(firstCharacterOfName));

  }
}

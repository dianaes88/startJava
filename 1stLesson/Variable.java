/*
*program prints all primitive data types
**/
public class Variable {
    public static void main(String[] args) {
        //primitive data types
        //integer types
        byte coreNumber = 6;
        System.out.println("The numbers of cores is " + Byte.toString(coreNumber));

        short osVersionNumber = 10;
        System.out.println("The operation system version number is " + Short.toString(osVersionNumber));

        int numberOfDrives = 2;
        System.out.println("The number of drives is " + Integer.toString(numberOfDrives));

        long numberOfProcessInUse = 250L;
        System.out.println("The number of processes in use is " + Long.toString(numberOfProcessInUse));

        //floating point
        double ramInGB = 16.07896543;
        System.out.println("RAM size is " + Double.toString(ramInGB) + "GB");

        float frequencyInGhz = 3.0012345F;
        System.out.println("The frequency of CPU is " + Float.toString(frequencyInGhz) + "GHz");

        //boolean type
        boolean isOsLinux = false;
        System.out.println("The sowtware is Linux " + Boolean.toString(isOsLinux));

        //char type
        char firstCharacterOfName = 'n';
        System.out.println("The first character of the computer name is " + firstCharacterOfName);
  }
}

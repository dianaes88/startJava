/*
*program prints Unicode symbols with index[33-126]
**/
public class Unicode {
    public static void main(String[] args) {
        char startRange = 33;
        char endRange = 126;
        while (startRange <= endRange) {
            System.out.printf("%s ", startRange++);
        }
    }
}

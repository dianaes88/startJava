/*
*program prints Unicode symbols with index[33-126]
**/
public class Unicode {
    public static void main(String[] args) {
        char chFrom = 33;
        char chTo = 126;
        while (chFrom <= chTo ) {
            System.out.printf("%s ", chFrom);
            chFrom++;
        }
    }
}

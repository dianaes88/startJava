/*
*program prints personality characteristics (hardcoded)
**/
public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 32;
        boolean isFemale = true;
        double heightInMeters = 1.58;
        char firstNameLetter = 'D';

        //check the age
        if (age > 20) {
            System.out.println("You're over 20 years old.");
        }

        //check the male
        if (!isFemale) {
            System.out.println("You're a man");
        } else {
            System.out.println("You're a woman");
        }

        //check the height
        if (heightInMeters < 1.80) {
            System.out.println("Your're shorter than 1.80 m.");
        } else {
            System.out.println("Your height is more or equal 1.80 m.");
        }

        //check the first name's character
        if (firstNameLetter == 'M') {
            System.out.println("Your name begins with 'M'.");
        } else if (firstNameLetter == 'I') {
            System.out.println("Your name begins with 'I'.");
        } else {
            System.out.println("Your name starts neither 'M' nor 'I'.");
        }
    }
}

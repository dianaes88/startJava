public class ConditionalStatement{
  public static void main(String[] args) {
    int ageInYears = 32;
    boolean IsFemale = true;
    double heightInMeters = 1.58;
    char firstCharacterOfName = 'D';
    //check the age
    if (ageInYears > 20){
      System.out.println("You're over 20 years old.");
    }

    //check the male
    System.out.println("You're a " + ( !IsFemale ? "man": "woman."));

    //check the height
    if (heightInMeters < 1.80){
      System.out.println("Your're shorter than 1.80 m.");
    }
    else{
      System.out.println("Your height is more or equal 1.80 m.");
    }

    //check the first name's character
    switch (firstCharacterOfName){
      case 'M':
        System.out.println("Your name begins with 'M'.");
        break;
      case 'I':
        System.out.println("Your name begins with 'I'.");
        break;
      default:
        System.out.println("Your name starts neither 'M' nor 'I'.");
    }

  }
}

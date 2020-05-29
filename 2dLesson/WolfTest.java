public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 3;
        wolf.male = "male";
        wolf.weight = 20.375f;
        wolf.name = "White Fang";
        wolf.color = "white";

        System.out.println("Wolf's male is ".concat(wolf.male));
        System.out.println("Wolf's name is " + wolf.name);
        System.out.println("Wolf's color is ".concat(wolf.color));
        System.out.println(String.format("Wolf's age is %d years", wolf.age));
        System.out.println("Wolf's weight is " + Float.toString(wolf.weight) + "kg");

        wolf.walk();
        wolf.sitDown();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

public class WolfTest {
    public static void main(String[] args) {

        Wolf wolf = new Wolf();
        /*
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
        */
        wolf.setMale("female");
        System.out.println("Wolf's male after set is " + wolf.getMale());

        wolf.setName("Volchitsa");
        System.out.println("Wolf's name after set is " + wolf.getName());

        wolf.setColor("grey");
        System.out.println("Wolf's color after set is " + wolf.getColor());

        wolf.setAge(5);
        System.out.println("Wolf's age after set is " + wolf.getAge());

        wolf.setAge(9);
        System.out.println("Wolf's age after set in the 2nd time is " + wolf.getAge());

        wolf.setWeight(25.5558f);
        System.out.println("Wolf's weight after set is " + wolf.getWeight());

        wolf.walk();
        wolf.sitDown();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

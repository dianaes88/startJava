public class Person {

    private String name;
    private String male;
    private int age;
    private float weight;
    private float height;

    public Person() {
        this.name = "Ivan";
        this.male = "man";
        this.age = 20;
        this.weight = 80.0f;
        this.height = 1.70f;
    }

    private Person(String name, String male, int age, float weight, float height) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void sit() {
        System.out.println("I can sit.");
    }

    public void run() {
        System.out.println("I can run.");
    }

    public void walk() {
        System.out.println("I can walk.");
    }

    public void talk() {
        System.out.println("I can talk.");
    }

    public void learnJava() {
        System.out.println("I can learn Java language.");
    }
}

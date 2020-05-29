public class Wolf {
    private String male;
    private String name;
    private String color;
    private int age;
    private float weight;

    //get methods
    public String getMale() {
        return this.male;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public float getWeight() {
        return this.weight;
    }

    //set methods
    public void setMale(String male) {
        this.male = male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age!");
        } else {
            this.age = age;
        }
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //functionality
    public void walk() {
        System.out.println("Wolf can walk.");
    }

    public void sitDown() {
        System.out.println("Wolf can sit down.");
    }

    public void run() {
        System.out.println("Wolf can run.");
    }

    public void howl() {
        System.out.println("Wolf can howl.");
    }

    public void hunt() {
        System.out.println("Wolf can hunt.");
    }
}

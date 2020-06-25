public class Jaeger {
    private String model;
    private String mark;
    private String origin;
    private String color;
    private float weight;
    private float height;
    private int speed;
    private int armour;
    private int numKaijuKilled;
    private boolean isDestroyed;

    public Jaeger() {

    }

    public Jaeger(String model, String mark, String origin, String color,
                    float weight, float height, int speed, int armour, int numKaijuKilled,
                    boolean isDestroyed) {
        this.model = model;
        this.mark = mark;
        this.origin = origin;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
        this.armour = armour;
        this.numKaijuKilled = numKaijuKilled;
        this.isDestroyed = isDestroyed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getNumKaijuKilled() {
        return numKaijuKilled;
    }

    public void setNumKaijuKilled(int numKaijuKilled) {
        this.numKaijuKilled = numKaijuKilled;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setIsDestroyed(boolean isDestroyed) {
        this.isDestroyed = isDestroyed;
    }

    public String toString() {
        String info = String.format("Model - [%s],\n mark - [%s],\n origin -[%s],\n color - [%s],\n weight - [%s],\n height - [%s],\n speed - [%d],\n armour - [%d],\n number of killed Kaiju -[%d],\n isDestroyed - [%s]",
        model, mark, origin, color, Float.toString(weight), Float.toString(height), speed, armour, numKaijuKilled, Boolean.toString(isDestroyed));
        return(info);
    }

    public void move(int x, int y) {
        System.out.printf("Jaeger %s is moved in coordinates [%d;%d]\n", this.getModel(), x, y);
    }

    public boolean attackKaiju() {
        System.out.printf("Jaeger %s is attacking\n", this.getModel());
        return true;
    }

    public void useWeapon() {
        System.out.printf("Jaeger %s uses weapon against the enemy\n", this.getModel());
    }

    public void kick() {
        System.out.printf("Jaeger %s is kicking\n", this.getModel());
    }

    public void jump() {
        System.out.printf("Jaeger %s is jumping\n", this.getModel());
    }

    public void avaidAttack() {
        System.out.printf("Jaeger %s is avaiding attack\n", this.getModel());
    }
}
